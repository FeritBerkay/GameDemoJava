
public class User {
	private int Id;
	private String Name;	
	private long TcNo;
	private String BornDate;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getTcNo() {
		return TcNo;
	}
	public void setTcNo(long tcNo) {
		TcNo = tcNo;
	}	
	public String getBornDate() {
		return BornDate;
	}
	public void setBornDate(String bornDate) {
		BornDate = bornDate;
	}
	public User(int id, String name, long tcNo, String bornDate) {
		super();
		Id = id;
		Name = name;
		TcNo = tcNo;
		BornDate = bornDate;
	}
	public User() {
		
	}
}
