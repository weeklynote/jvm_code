package runtime;

/**
 * ģ��StackOverflowError�쳣
 * ʹ��ʱע������JVMջ��������-Xss128k
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
