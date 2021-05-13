package Day4Hw3.Abstract;

import Day4Hw3.Entities.Game;

public interface GameService {

	void save(Game game);
	void update(Game game, double newPrice);
	void delete(Game game);
}
