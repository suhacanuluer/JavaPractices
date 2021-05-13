package Day4Hw3;

import Day4Hw3.Adapters.MernisServiseAdapter;
import Day4Hw3.Concrete.CampaingManager;
import Day4Hw3.Concrete.GameManager;
import Day4Hw3.Concrete.GamerManager;
import Day4Hw3.Concrete.SaleManager;
import Day4Hw3.Entities.Campaign;
import Day4Hw3.Entities.Game;
import Day4Hw3.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager(new MernisServiseAdapter());
		SaleManager saleManager = new SaleManager();
		CampaingManager campaingManager = new CampaingManager();
		
		Gamer gamer1 = new Gamer(1, "Süha Can", "Uluer", 1999, "15193285554");
		gamerManager.save(gamer1);
		gamerManager.update(gamer1, "İrem", "Keskin");
		
		Game game1 = new Game(1, "God of War", "Epic, Aksiyon", "SIE Santa Monica Studio", 100);
		gameManager.save(game1);
		gameManager.update(game1, 90);
		
		saleManager.sale(gamer1, game1);
		
		Campaign campaign1 = new Campaign(1, "Bahar", 30);
		campaingManager.save(campaign1);
		
		saleManager.saleWithCampaign(gamer1, game1, campaign1);

		campaingManager.update(campaign1, 20);
		saleManager.saleWithCampaign(gamer1, game1, campaign1);
		
		campaingManager.delete(campaign1);
		gamerManager.delete(gamer1);
		gameManager.delete(game1);
	}
}
