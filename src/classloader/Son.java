package classloader;

public class Son extends Father{

	public static int b = 14;
	public final static int c = 16;
	static{
		System.out.println("......son init.....");
	}
}
