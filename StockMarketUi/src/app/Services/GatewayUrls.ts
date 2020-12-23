export class GatewayUrls{
    readonly LoginEndpoint: string = 'http://localhost:8662/api/user-data-service/user';
readonly RegisterEndpoint: string = 'http://localhost:8662/api/User-data-service/user/adduser';
readonly CompanyEndpoint: string = 'http://localhost:8662/api/company-data-service/company';
readonly IPOEndpoint: string = 'http://localhost:8622/api/company-data-service/IPO';
readonly SectorEndpoint: string = 'http://localhost:8622/api/sector-data-service/Sector';
readonly SectorbyEndpoint: string = 'http://localhost:8622/api/sector-data-service/companybysector';
readonly seEndpoint: string = 'http://localhost:8622/api/stock-exchange-data-service/StockExchange'; 
}