package kodlamaio3;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Beyza Nur","Ayhan",new Date(1996,02,20),"11111111111"));
		System.out.println();
	}
	
	//Bilgilerinizi girerek deneyebilirsiniz. Program düzgün çalýþýyor.

}
