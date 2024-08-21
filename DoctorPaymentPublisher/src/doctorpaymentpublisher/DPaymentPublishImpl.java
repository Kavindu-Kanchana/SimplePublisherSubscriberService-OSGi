package doctorpaymentpublisher;

//Get ArrayList for Store inputs in an array
import java.util.ArrayList;

//Get Formatter for displaying a nice output
import java.util.Formatter;

public class DPaymentPublishImpl implements DPaymentPublish {
	
	//Declare an ArrayList
	ArrayList<String> docNameList = new ArrayList<String>();
	ArrayList<String> mobileNumberList = new ArrayList<String>();
	ArrayList<String> docSpecialList = new ArrayList<String>();
	ArrayList<Integer> docSalaryBasicList = new ArrayList<Integer>();
	ArrayList<Integer> OT_RatesList = new ArrayList<Integer>();
	ArrayList<Integer> OT_HoursList = new ArrayList<Integer>();
	ArrayList<Integer> monthlySalaryList = new ArrayList<Integer>();

	//Declare Add Doctor method
	@Override
	public void addDoctor(String docName, String mobileNumber, String docSpecial, int salaryBasic, int OT_Rate, int OT_Hours) {
		docNameList.add(docName);
		mobileNumberList.add(mobileNumber);
		docSpecialList.add(docSpecial);
		docSalaryBasicList.add(salaryBasic);
		OT_RatesList.add(OT_Rate);
		OT_HoursList.add(OT_Hours);
	}
	
	//Declare getTotal method to calculate Monthly salary of a doctor
	@Override
	public void getTotal(int salaryBasic, int OT_Rate, int OT_Hours) {
		Integer Total = salaryBasic + OT_Hours * OT_Rate;
		monthlySalaryList.add(Total);
	}
	
	//Declare calculateTotalAll method to find Total salary to be paid
	@Override
	public String calculateTotalAll() {
		
		int allTotal = 0;
		
		for(int i = 0; i < docSpecialList.size(); i++) {
			allTotal = allTotal + monthlySalaryList.get(i);
		}
		
		String Finalmsg = "Total Salary To be Paid for the Doctors = Rs." + allTotal + ".00";
		
		return Finalmsg;
	}
	
	//Declare displayAll method using Format to display console output
	@Override
	public Formatter displayAll() {
		
		//Display Headers
		Formatter format = new Formatter();
		format.format("%22s %20s %22s %22s %22s %22s %25s\n", "Doctor's Name(Dr.)", "Mobile Number", "Dr's Specialization", "Basic Salary(Rs.)", "OT_Rate(Rs.)", "Worked_OT_Hours", "Monthly Salary (Rs.)\n");
		
		//Display inputs in the ArrayList
		for (int i=0;i<docSpecialList.size();i++) {
			format.format("%20s %20s %20s %20s %22s %22s %22s\n",docNameList.get(i),mobileNumberList.get(i),docSpecialList.get(i),docSalaryBasicList.get(i),OT_RatesList.get(i),OT_HoursList.get(i),monthlySalaryList.get(i));
		}
		
		return format;
	}
}
