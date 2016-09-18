package hr.dorescanin.hibp.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import hr.dorescanin.hibp.services.base.BaseService;
import hr.dorescanin.hibp.services.base.ServiceConfigurator;
import hr.dorescanin.hibp.services.base.ServiceInfo;

public class DataClasses {
	
	public static final String SERVICE_NAME = "dataclasses"; 

	BaseService baseService;
	WebTarget dataClassesTarget;
	ServiceInfo serviceInfo = ServiceInfo.getDefault();
	
	public DataClasses() {
		baseService = new BaseService(SERVICE_NAME);
		dataClassesTarget = baseService.getService();
		dataClassesTarget = dataClassesTarget.resolveTemplate("parameter", "");
	}
	
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	
	public List<String> getDataClasses() {
		
		List<String> result = ServiceConfigurator.
			configureService(dataClassesTarget, serviceInfo).
			get().
			readEntity(new GenericType<List<String>>(){});

		return result != null ? result : new ArrayList<>();
	}

}
