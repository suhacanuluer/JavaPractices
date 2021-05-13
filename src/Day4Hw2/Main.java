package Day4Hw2;

import Day4Hw2.Abstract.BaseCustomerManager;
import Day4Hw2.Adapters.MernisServiceAdapter;
import Day4Hw2.Concrete.NeroCustomerManager;
import Day4Hw2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Süha Can", "Uluer", 1999, "15193285554"));
	}

}
