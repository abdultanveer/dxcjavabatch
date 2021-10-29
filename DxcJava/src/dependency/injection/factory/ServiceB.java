package dependency.injection.factory;

import dependency.injection.Service;

public class ServiceB  implements Service{

	@Override
	public String getInfo() {
        return "ServiceB’s Info";
	}
	
	
}