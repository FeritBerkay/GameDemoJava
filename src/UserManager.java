
public class UserManager {
	public  static void register(User user) {
		if(user.getTcNo()>0) {
			System.out.println(user.getName() +" Registed");
		}
		else {
			System.out.println("Invalid TcNo");
		}
	}
	public static void Login(User user) {
		System.out.println(user.getName() +" Logined");
	}
	public static void update(User user) {
		System.out.println(user.getName() +" Updated");
	}	
	public static void Delete(User user) {
		System.out.println(user.getName() + " Deleted");
	}
	public static void Verifaction(User user) {
		if(user.getTcNo()>0) {
			System.out.println(user.getName() + " Verified");
		}
	}
}
