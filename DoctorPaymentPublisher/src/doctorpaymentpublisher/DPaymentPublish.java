package doctorpaymentpublisher;

//Importing Formatter class
import java.util.Formatter;

//Declare an interface class
public interface DPaymentPublish {
	
	//Declare addDoctor method
	public void addDoctor(String docName, String mobileNumber, String docSpecial, int salaryBasic, int OT_Rate, int OT_Hours);
	
	//Declare getTotal method
	public void getTotal(int salaryBasic, int OT_Rate, int OT_Hours);
	
	//Declare Formatter method
	public Formatter displayAll();

	//Declare calculateTotalAll method
	public String calculateTotalAll();

}
