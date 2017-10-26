package classloader;

public class LoaderStaticWithoutFinal {
	static{
		System.out.println(".....LoaderStaticWithoutFinal...........");
	}
	public static int a;
	public static int b = 0;
	public static LoaderStaticWithoutFinal loader = new LoaderStaticWithoutFinal();
	public LoaderStaticWithoutFinal(){
		a++;
		b++;
	}

	public static void main(String[] args) {
		// 调用LoaderMain.a将导致对LoaderMain进行类初始化，在准备阶段初始化静态域
		// 因此这种情况下打印的结果为1,0
		// 如果将loader的创建放在静态变量b之后，那么将打印出1,1
		System.out.println(LoaderStaticWithoutFinal.a);
		System.out.println(LoaderStaticWithoutFinal.b);
	}

}
