package Day4Hw3.Concrete;

import Day4Hw3.Abstract.SaleService;
import Day4Hw3.Entities.Campaign;
import Day4Hw3.Entities.Game;
import Day4Hw3.Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + game.getPrice() + "₺'ye " + game.getName() + " oyununu satın aldı.");
		
	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		double newPrice = game.getPrice() - campaign.getDiscount();
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + campaign.getName() + " kampanyası ile " + game.getPrice() + "₺ yerine " + newPrice + "₺'ye " + game.getName() + " oyununu satın aldı.");
		
	}
}
