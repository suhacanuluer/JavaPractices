package Day4Hw3.Adapters;

import Day4Hw2.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import Day4Hw3.Abstract.GamerCheckServise;
import Day4Hw3.Entities.Gamer;

public class MernisServiseAdapter implements GamerCheckServise{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalId()),
					gamer.getFirstName(),
					gamer.getLastName(),
					gamer.getYearOfBirth()
					);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
