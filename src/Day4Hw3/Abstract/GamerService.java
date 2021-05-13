package Day4Hw3.Abstract;

import Day4Hw3.Entities.Gamer;

public interface GamerService {

	void save(Gamer gamer);
	void update(Gamer gamer, String newFirstName, String newLastName);
	void delete(Gamer gamer);
}
