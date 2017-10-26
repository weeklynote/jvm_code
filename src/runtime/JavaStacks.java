package runtime;

/**
 * 模拟StackOverflowError异常
 * 使用时注意配置JVM栈参数，如-Xss128k
 *
 */
public class JavaStacks {
	
	private void testStackOverflowErroe(){
		System.out.println("test........");
		testStackOverflowErroe();
	}

	public static void main(String[] args) {
		new JavaStacks().testStackOverflowErroe();
	}

}
