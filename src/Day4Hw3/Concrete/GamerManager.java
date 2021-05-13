package Day4Hw3.Concrete;

import Day4Hw3.Abstract.GamerCheckServise;
import Day4Hw3.Abstract.GamerService;
import Day4Hw3.Entities.Gamer;

public class GamerManager implements GamerService {
	
	GamerCheckServise gamerCheckServise;

	public GamerManager(GamerCheckServise gamerCheckServise) {
		this.gamerCheckServise = gamerCheckServise;
	}

	@Override
	public void save(Gamer gamer) {
		if(gamerCheckServise.checkIfRealPerson(gamer)) {
			System.out.println("Gamer " + gamer.getFirstName() + " " + gamer.getLastName() + " kaydoldu.");
		} else {
			System.out.println("Mernis doğrulaması yapılamadı. Kayıt başarısız!!");
		}	
	}

	@Override
	public void update(Gamer gamer, String newFirstName, String newLastName) {
		System.out.println("GÜNCELLEME!! Gamer " + gamer.getFirstName() + " " + gamer.getLastName() + " bilgilerini " + newFirstName + " " + newLastName + " olarak güncelledi.");
		gamer.setFirstName(newFirstName);
		gamer.setLastName(newLastName);
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer " + gamer.getFirstName() + " " + gamer.getLastName() + " silindi.");
		
	}
}
