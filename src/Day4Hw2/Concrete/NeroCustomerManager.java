package Day4Hw2.Concrete;

import Day4Hw2.Abstract.BaseCustomerManager;
import Day4Hw2.Abstract.CustomerCheckService;
import Day4Hw2.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public  NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("The user not saved. Mernis verification failed.");
		}
	}	
}
