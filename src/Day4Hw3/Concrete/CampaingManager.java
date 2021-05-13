package Day4Hw3.Concrete;

import Day4Hw3.Abstract.CampaignService;
import Day4Hw3.Entities.Campaign;

public class CampaingManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası " + campaign.getDiscount() + "₺ indirim ile kaydedildi!");
		
	}

	@Override
	public void update(Campaign campaign, double newDiscount) {
		System.out.println("GÜNCELLEME!! " + campaign.getName() + " kampanyası " + campaign.getDiscount() + "₺ indirim tutarı " + newDiscount + "₺ olarak güncellendi.");
		campaign.setDiscount(newDiscount);
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getDiscount() + "₺ indirimli " + campaign.getName() + " kampanyası sona ermiştir.");
		
	}

}
