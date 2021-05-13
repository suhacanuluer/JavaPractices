package Day4Hw3.Concrete;

import Day4Hw3.Abstract.GameService;
import Day4Hw3.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void save(Game game) {
		System.out.println(game.getName() + " isimli oyun " + game.getProducer() + " tarafından " + game.getPrice() + "₺'ye satışta!");
		
	}

	@Override
	public void update(Game game, double newPrice) {
		System.out.println("GÜNCELLEME!! " + game.getName() + " isimli oyun " + game.getProducer() + " tarafından " + game.getPrice() + "₺ yerine " + newPrice + "₺'ye satışta!");
		game.setPrice(newPrice);
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " isimli oyun " + game.getProducer() + " tarafından" + " satıştan kaldırıldı!!");
		
	}
}
