
public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setBornDate("29.09.2005");
		user1.setId(1);
		user1.setName("Ferit");
		user1.setTcNo(124134);;
		Product product1 = new Product(1, "Forza Horizon",240);
		UserManager userManager = new UserManager();
		ProductManager productManager = new ProductManager();
		Campaign campaign1 = new Campaign();
		CampaignManager campaignManager = new CampaignManager();
		campaign1.Id=1;
		campaign1.Discount=10;
		userManager.register(user1);
		productManager.buyWithCampaing(user1, product1, campaign1);
		campaignManager.delete(campaign1);
		}

}
