package offi_add_customer;

//import oops_assignment.AddressAE;

class Customer  {

	
	private String customerName;
	private String residentialAddress;
	private String officialAddress;
	
	
	public Customer()
	{
		
	}
	public Customer(String customerName, String residentialAddress, String officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}

	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(String officialAddress) {
		this.officialAddress = officialAddress;
	}

	public void getCustomerDetails()
	{
		System.out.println(customerName);
		System.out.println(residentialAddress);
		System.out.println(officialAddress);
		//getAddressDetails();
	}
	
	
}
public class CustomerOfficial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer("jhon","1st main hsr layout,Banglore","1st main electronics ,Bangalore");
		c.getCustomerDetails();
		
	}

}
