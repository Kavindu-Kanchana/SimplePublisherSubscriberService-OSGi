package doctorpaymentsubscriber;

//import Scanner class
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

//import doctorpaymentpublisher's DpaymentPublish
import doctorpaymentpublisher.DPaymentPublish;

public class DPaymentActivator implements BundleActivator {
	
	ServiceReference serviceReference;

	//Start method of subscriber
	public void start(BundleContext context) throws Exception {
		
		serviceReference = context.getServiceReference(DPaymentPublish.class.getName());
		DPaymentPublish dPaymentPublish = (DPaymentPublish) context.getService(serviceReference);
		
		//Displaying Subscriber's start message
		System.out.println("Doctor Payment Subscriber Started\n");
		System.out.println(" ");
		
		//Get scanner class for inputs
		Scanner sc = new Scanner(System.in);
				
		System.out.println("--To Exit Please Enter a Blank Line--\n");
		
		while(true) {
			
			//Taking doctor's name as a user input
			System.out.println("Enter the Doctor's name (Dr.): ");
			String docName = sc.nextLine();
			
			//Checking for Blank input to exit
			if(docName.length() == 0) {
				break;
			}
						
			//Taking doctor's mobile number as a user input and validate		
			String mobileNumber = "";
			while (mobileNumber.length() != 10) {
				System.out.println("Enter Doctor's Mobile Number (10 digits): ");
				mobileNumber = sc.nextLine();
				
				//Checking for Blank input to exit
				if(mobileNumber.length() == 0) {
					break;
				}
				
				else if(mobileNumber.length() != 10) {
					System.out.println("\nInvalid input. Please Enter a 10 digit number\n");
				}
			}
			//Checking for Blank input to exit
			if(mobileNumber.length() == 0) {
				break;
			}
			
			//Taking doctor's Specialization as a user input
			System.out.println("Enter the Doctor's Specialization: ");
			String docSpecial = sc.nextLine();
			
			//Checking for Blank input to exit
			if(docSpecial.length() == 0) {
				break;
			}
			
			//Taking doctor's Basic Salary as a user input
			System.out.println("Enter the Doctor's Basic Salary Amount for a month (Rs.): ");
			int bSalary = sc.nextInt();
			
			//Taking doctor's OT Rate as a user input
			System.out.println("Enter the OT Rate Paying Per Hour (Rs.): ");
			int OT_Rate = sc.nextInt();
			
			//Taking doctor's OT Hours as a user input
			System.out.println("Enter the number of OT Hours the doctor worked (hrs): ");
			int OT_Hours = sc.nextInt();
			
			//Leave a next line for scanner to consume and run the loop again 
			sc.nextLine();
			System.out.println();
			
			//Saving the user inputs
			if(docName != null && mobileNumber != null && docSpecial != null) {
				dPaymentPublish.addDoctor(docName, mobileNumber,docSpecial, bSalary , OT_Rate, OT_Hours);
				dPaymentPublish.getTotal(bSalary, OT_Rate, OT_Hours);
			}
			
		}
		
		//Console Final Output
		System.out.println("##############################################################################################################################################################");
		System.out.println("=========================  Calculate the Doctors Monthly Payment and the Total Salary Amount To Pay For the Doctors and Display them =========================");
		System.out.println();
		System.out.println(dPaymentPublish.displayAll());
		System.out.println(dPaymentPublish.calculateTotalAll());
		System.out.println();
		System.out.println("=================================================================== End of the Program ======================================================================");
		System.out.println("=================================================================== Thank You. ==============================================================================");
		System.out.println("=================================================================== Have a nice Day ! =======================================================================");
		System.out.println("##############################################################################################################################################################");
		
	}
	
	//Stop method of subscriber
	public void stop(BundleContext context) throws Exception {
		System.out.println("Doctor Payment Subscriber Stopped");
		context.ungetService(serviceReference);	
	}

}
