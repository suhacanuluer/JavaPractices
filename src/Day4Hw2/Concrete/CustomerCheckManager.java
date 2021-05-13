package Day4Hw2.Concrete;

import Day4Hw2.Abstract.CustomerCheckService;
import Day4Hw2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		return true;
	};
}
