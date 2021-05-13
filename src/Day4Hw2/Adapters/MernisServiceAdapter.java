package Day4Hw2.Adapters;

import java.rmi.RemoteException;

import Day4Hw2.Abstract.CustomerCheckService;
import Day4Hw2.Entities.Customer;
import Day4Hw2.tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName(), 
					customer.getLastName(), 
					customer.getDateOfBirth()
					);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}
}
