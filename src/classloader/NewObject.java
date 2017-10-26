package classloader;

public class NewObject {
	
	static{
		System.out.println(".....NewObject...........");
	}

	public static void main(String[] args) {
		new NewObject();
	}

}
