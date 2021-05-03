
public class ProductManager {
	public static void buyWithCampaing(User user, Product product, Campaign campaign){
		 float price = product.getPrice() - (product.getPrice() * campaign.Discount /100) ;
	     System.out.println(String.format("Success Buy Name= " + user.getName() + " Game= " + product.getGame() + " Price= " + price));
	 }
	 public void buy(User user, Product product){
	        System.out.println("Success Buy" + user.getName());
	    }

	 public void add(Product product) {
	        System.out.println("Product Added: " + product.toString());
	    }

	    public void update(Product product) {
	        System.out.println("Product updated: " + product.toString());

	    }

	    public void delete(Product product) {
	        System.out.println("Product deleted: " + product.toString());
	    }
}
