package hr.dorescanin.hibp.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import hr.dorescanin.hibp.json.BreachJSON;
import hr.dorescanin.hibp.services.base.BaseService;
import hr.dorescanin.hibp.services.base.ServiceConfigurator;
import hr.dorescanin.hibp.services.base.ServiceInfo;

public class BreachesForAccount {
	
	public static final String SERVICE_NAME = "breachedaccount"; 

	BaseService baseService;
	WebTarget breachedAccountTarget;
	ServiceInfo serviceInfo = ServiceInfo.getDefault();
	
	public BreachesForAccount(String account) {
		baseService = new BaseService(SERVICE_NAME);
		breachedAccountTarget = baseService.getService();
		breachedAccountTarget = breachedAccountTarget.resolveTemplate("parameter", account);
	}
	
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	
	public BreachesForAccount truncateResponse() {
		breachedAccountTarget = breachedAccountTarget.queryParam("truncateResponse", "true");
		return this;
	}
	
	public BreachesForAccount filterDomain(String domainName) {
		breachedAccountTarget = breachedAccountTarget.queryParam("domain", domainName);
		return this;
	}
	
	
	public List<BreachJSON> getList() {
		
		List<BreachJSON> result = ServiceConfigurator.
			configureService(breachedAccountTarget, serviceInfo).
			get().
			readEntity(new GenericType<List<BreachJSON>>(){});

		return result != null ? result : new ArrayList<>();
	}

}
