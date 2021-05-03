
public class Product {
	private int Id;
	private String Game;
	private int Price;
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Product(int id, String game, int price) {
		super();
		Id = id;
		Game = game;
		Price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGame() {
		return Game;
	}
	public void setGame(String game) {
		Game = game;
	}
	public Product(int id, String game) {
		super();
		Id = id;
		Game = game;
	}
	
}
