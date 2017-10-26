package reference;
import java.lang.ref.WeakReference;


public class WeakReferenceTest {

	public static void main(String[] args) {
		String str = new String("weak...");
		WeakReference<String> weakReference = new WeakReference<String>(str);
		str = null;
		System.out.println(weakReference.get());
		System.gc();
		System.runFinalization();
		System.out.println(weakReference.get());
	}

}
