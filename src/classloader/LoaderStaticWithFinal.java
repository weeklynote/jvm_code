package classloader;

public class LoaderStaticWithFinal {

	// 使用类的常量不会引起类的初始化
	public static void main(String[] args) {
		// static final常量不会引起类的加载及初始化
		System.out.println(StaticLoader.b);
		// static final变量会引起类的加载及初始化
		System.out.println(StaticLoader.c);
	}
}
