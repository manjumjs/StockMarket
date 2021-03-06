import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { JwtTockenService } from './Services/jwt-tocken.service';

@Injectable({
  providedIn: 'root'
})
export class OnlyAuthenticatedUserGuard implements CanActivate {
  constructor(private token: JwtTockenService, private router: Router) {

  }
  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      if (this.token.getIsAuthenticated()) { 
        return true;
      } else {
        this.token.resetToken();
        this.router.navigateByUrl('/login');
      }
  }
  
}
