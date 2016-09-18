package hr.dorescanin.hibp.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import hr.dorescanin.hibp.json.BreachJSON;
import hr.dorescanin.hibp.services.base.BaseService;
import hr.dorescanin.hibp.services.base.ServiceConfigurator;
import hr.dorescanin.hibp.services.base.ServiceInfo;

public class BreachedSitesList {
	
	public static final String SERVICE_NAME = "breaches"; 

	BaseService baseService;
	WebTarget breachesTarget;
	ServiceInfo serviceInfo = ServiceInfo.getDefault();
	
	public BreachedSitesList() {
		baseService = new BaseService(SERVICE_NAME);
		breachesTarget = baseService.getService();
		breachesTarget = breachesTarget.resolveTemplate("parameter", "");
	}
	
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	
	public BreachedSitesList filterDomain(String domainName) {
		breachesTarget = breachesTarget.queryParam("domain", domainName);
		return this;
	}
	
	
	public List<BreachJSON> getList() {
		
		List<BreachJSON> result = ServiceConfigurator.
			configureService(breachesTarget, serviceInfo).
			get().
			readEntity(new GenericType<List<BreachJSON>>(){});

		return result != null ? result : new ArrayList<>();
	}
	
}
