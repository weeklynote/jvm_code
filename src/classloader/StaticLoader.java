package classloader;

import java.util.Random;

public class StaticLoader {
	
	public static int a = 12;
	// static final��̬����
	public final static int b = 12;
	// static final��̬����
	public final static int c = new Random().nextInt(6);
	static{
		System.out.println(".....StaticLoader...........");
	}
	
	public static void test(){
		
	}

}
