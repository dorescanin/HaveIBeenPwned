package hr.dorescanin.hibp.services;

import javax.ws.rs.client.WebTarget;

import hr.dorescanin.hibp.json.BreachJSON;
import hr.dorescanin.hibp.services.base.BaseService;
import hr.dorescanin.hibp.services.base.ServiceConfigurator;
import hr.dorescanin.hibp.services.base.ServiceInfo;

public class BreachedSite {
	
	public static final String SERVICE_NAME = "breach"; 

	BaseService baseService;
	WebTarget breachTarget;
	ServiceInfo serviceInfo = ServiceInfo.getDefault();
	
	public BreachedSite(String name) {
		baseService = new BaseService(SERVICE_NAME);
		breachTarget = baseService.getService();
		breachTarget = breachTarget.resolveTemplate("parameter", name);
	}
	
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	
	public BreachJSON getBreach() {
		
		BreachJSON result = ServiceConfigurator.
			configureService(breachTarget, serviceInfo).
			get().
			readEntity(BreachJSON.class);

		return result;
	}

}
