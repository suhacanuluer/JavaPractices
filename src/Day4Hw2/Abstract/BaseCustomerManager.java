package Day4Hw2.Abstract;

import Day4Hw2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	public void save(Customer customer) {
		System.out.println("Saved to database: " + customer.getFirstName());
	}
}
