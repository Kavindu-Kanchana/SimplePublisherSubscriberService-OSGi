package doctorpaymentpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DPaymentActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	//Declare Start Method
	public void start(BundleContext context) throws Exception {
		//Display Publisher Started Method
		System.out.println("Doctor Payment Publisher Started");
		
		//Create new object
		DPaymentPublish dPaymentPublish = new DPaymentPublishImpl();
		
		//Register the Service
		publishServiceRegistration = context.registerService(DPaymentPublish.class.getName(), dPaymentPublish, null);
	}
	
	//Declare Stop Method
	public void stop(BundleContext context) throws Exception {
		
		//Display Publisher Started Method
		System.out.println("Doctor Payment Publisher Stopped");
		
		//unregister the service
		publishServiceRegistration.unregister();
	}

}
