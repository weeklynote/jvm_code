package classloader;

public class Reflect {

	public static void main(String[] args) {
		try {
			Class.forName("classloader.StaticLoader");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
