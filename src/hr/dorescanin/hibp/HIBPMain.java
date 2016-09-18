package hr.dorescanin.hibp;

import java.util.List;

import hr.dorescanin.hibp.json.BreachJSON;
import hr.dorescanin.hibp.json.PasteJSON;
import hr.dorescanin.hibp.services.BreachedSite;
import hr.dorescanin.hibp.services.BreachedSitesList;
import hr.dorescanin.hibp.services.BreachesForAccount;
import hr.dorescanin.hibp.services.DataClasses;
import hr.dorescanin.hibp.services.PasteAccount;
import hr.dorescanin.hibp.services.base.ServiceInfo;

public class HIBPMain {
	public static void main(String[] args) {
		
		
		System.out.println("---------------------------------------------");
		System.out.println("https://haveibeenpwned.com/api/v2/breachedaccount/{account}");
		System.out.println("---------------------------------------------");
		
		BreachesForAccount breaches = new BreachesForAccount("test@example.com");
		breaches.setServiceInfo(new ServiceInfo("Test application..."));
		breaches.truncateResponse();
		breaches.filterDomain("dropbox.com");
		
		List<BreachJSON> list = breaches.getList();

		for (BreachJSON breachJSON : list) {
			System.out.println(breachJSON);
		}
		
		
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("https://haveibeenpwned.com/api/v2/breaches");
		System.out.println("---------------------------------------------");
		
		BreachedSitesList bsl = new BreachedSitesList();
//		bsl.filterDomain("dropbox.com");
		
		List<BreachJSON> list2 = bsl.getList();

		System.out.println(list2.size());
		
		
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("https://haveibeenpwned.com/api/v2/breach/{name}");
		System.out.println("---------------------------------------------");
		
		BreachJSON breach = new BreachedSite("adobe").getBreach();
		
		System.out.println(breach);
		
		
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("https://haveibeenpwned.com/api/v2/dataclasses");
		System.out.println("---------------------------------------------");
		
		List<String> dataClasses = new DataClasses().getDataClasses();

		System.out.println(dataClasses);
		
		
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("https://haveibeenpwned.com/api/v2/pasteaccount/{account}");
		System.out.println("---------------------------------------------");
		
		List<PasteJSON> list3 = new PasteAccount("test@example.com").getList();
		
		for (PasteJSON pasteJSON : list3) {
			System.out.println(pasteJSON);
		}
		
	}
}
