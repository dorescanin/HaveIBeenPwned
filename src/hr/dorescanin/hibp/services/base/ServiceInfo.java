package hr.dorescanin.hibp.services.base;

public class ServiceInfo {
	
	private String applicationName;
	private String apiVersion;

	public ServiceInfo(String applicationName, String apiVersion) {
		this.applicationName = applicationName;
		this.apiVersion = apiVersion;
	}
	
	public static ServiceInfo getDefault() {
		return new ServiceInfo("Default Java application");
	}
	
	public ServiceInfo(String applicationName) {
		this(applicationName, "2");
	}
	
	public String getApplicationName() {
		return applicationName;
	}
	
	public String getApiVersion() {
		return apiVersion;
	}
	
	
}
