package recycler;
import reference.Node;


/**
 * 根搜索算法类，根据对象从GC Root是否可达来判断对象是否可被回收
 * @author liujin
 *
 */
public class GCRoot {

	public static void main(String[] args) {
		test1();
	}
	
	private static void test1(){
		Node node1 = new Node("first");
		Node node2 = new Node("second");
		Node node3 = new Node("third");
		// node1的next指向node2
		node1.setNext(node2);
		// node3指向null，此时node3是可回收的对象
		node3 = null;
		// node2指向null，但是此时node1的next指向node2，所以node2依然是可达的，因此node2此时还不是可回收的对象
		node2 = null;
	}
}
