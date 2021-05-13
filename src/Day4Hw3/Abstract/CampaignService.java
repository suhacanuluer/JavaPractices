package Day4Hw3.Abstract;

import Day4Hw3.Entities.Campaign;

public interface CampaignService {

	void save(Campaign campaign);
	void update(Campaign campaign, double newDiscount);
	void delete(Campaign campaign);
}
