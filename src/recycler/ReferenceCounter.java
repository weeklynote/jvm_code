package recycler;

/**
 * 引用计数器算法类
 * @author liujin
 *
 */
public class ReferenceCounter {
	
	public Object instance;
	private byte[] data = new byte[1024 * 1024 * 2];

	public static void main(String[] args) {
		ReferenceCounter ref1 = new ReferenceCounter();
		ReferenceCounter ref2 = new ReferenceCounter();
		// ref1引用了ref2
		ref1.instance = ref2;
		// ref2引用了ref1，即形成了一种环形引用；在ref1不引用ref2的情况下，也不能对ref2进行回收，反之亦然。
		// 这将导致内存无法被回收，通过GC打印信息分析，此时内存是可以回收的。因此Java不是使用的这种回收算法。
		ref2.instance = ref1;
		ref1 = null;
		ref2 = null;
		System.gc();
	}

}
