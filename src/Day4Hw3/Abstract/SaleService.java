package Day4Hw3.Abstract;

import Day4Hw3.Entities.Campaign;
import Day4Hw3.Entities.Game;
import Day4Hw3.Entities.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);
	void saleWithCampaign(Gamer gamer, Game game, Campaign campaign);
}
