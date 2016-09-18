package hr.dorescanin.hibp.services.base;

import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ServiceConfigurator {
	
	public static Builder configureService(WebTarget service, ServiceInfo info) {
		
		Builder builder = service.
			request(MediaType.TEXT_PLAIN).
			header("api-version", info.getApiVersion()).
			header("User-Agent", info.getApplicationName());
		
		return builder;
	}
	
}
