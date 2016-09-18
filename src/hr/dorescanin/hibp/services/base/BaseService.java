package hr.dorescanin.hibp.services.base;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class BaseService {

	private WebTarget serviceTarget;
	
	public BaseService(String serviceName) {
		Client client = ClientBuilder.newClient();
		 WebTarget baseTarget = client.target("https://haveibeenpwned.com/api/{service}/{parameter}");
		 serviceTarget = baseTarget.resolveTemplate("service", serviceName);
	}
	
	public WebTarget getService() {
		return serviceTarget;
	}
	
}
