package reference;
import java.lang.ref.SoftReference;

// 
public class SoftReferenceTest {

	public static void main(String[] args) {
		// 数组长度小不会引起oom，且引用对象没被回收
//		SoftReference<Node>[] soft = new SoftReference[100];
		// 引用对象被回收
		SoftReference<Node>[] soft = new SoftReference[10000];
		for(int i = 0; i < soft.length; i++){
			soft[i] = new SoftReference<Node>(new Node("Node" + i));
		}
		System.out.println(soft[2].get());
		System.out.println(soft[0].get());
		System.gc();
		System.runFinalization();
		System.out.println(soft[2].get());
		System.out.println(soft[0].get());
		
	}

}
