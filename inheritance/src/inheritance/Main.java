package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer akin = new IndividualCustomer();
		akin.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer [] customers = {akin,abc, hepsiBurada};
		
		customerManager.addMultiple(customers);

	}

}
