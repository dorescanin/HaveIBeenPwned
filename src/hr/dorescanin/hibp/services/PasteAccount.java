package hr.dorescanin.hibp.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import hr.dorescanin.hibp.json.PasteJSON;
import hr.dorescanin.hibp.services.base.BaseService;
import hr.dorescanin.hibp.services.base.ServiceConfigurator;
import hr.dorescanin.hibp.services.base.ServiceInfo;

public class PasteAccount {
	
	public static final String SERVICE_NAME = "pasteaccount"; 

	BaseService baseService;
	WebTarget pasteAccountTarget;
	ServiceInfo serviceInfo = ServiceInfo.getDefault();
	
	public PasteAccount(String account) {
		baseService = new BaseService(SERVICE_NAME);
		pasteAccountTarget = baseService.getService();
		pasteAccountTarget = pasteAccountTarget.resolveTemplate("parameter", account);
	}
	
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	
	public PasteAccount filterDomain(String domainName) {
		pasteAccountTarget = pasteAccountTarget.queryParam("domain", domainName);
		return this;
	}
	
	
	public List<PasteJSON> getList() {
		
		List<PasteJSON> result = ServiceConfigurator.
			configureService(pasteAccountTarget, serviceInfo).
			get().
			readEntity(new GenericType<List<PasteJSON>>(){});

		return result != null ? result : new ArrayList<>();
	}
	
}
