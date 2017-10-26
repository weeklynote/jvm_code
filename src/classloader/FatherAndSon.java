package classloader;

public class FatherAndSon {

	public static void main(String[] args) {
		// 静态变量a属于父类，直接使用不会导致子类被初始化
		System.out.println(Father.a);
		System.out.println(Son.b);
		// 以下调用不会引起类的初始化，原理同LoaderStaticWithFinal
		System.out.println(Son.c);
	}

}
