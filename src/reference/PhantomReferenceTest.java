package reference;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;


public class PhantomReferenceTest {

	public static void main(String[] args) {
		String str = new String("hello");
		ReferenceQueue<String> queue = new ReferenceQueue<>();
		PhantomReference<String> phantom = new PhantomReference<String>(str, queue);
		str = null;
		System.out.println(phantom.get());
		System.gc();
		System.runFinalization();
		System.out.println(queue.poll() == phantom);
		System.out.println(phantom.get());
	}

}
