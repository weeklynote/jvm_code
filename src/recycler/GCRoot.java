package recycler;
import reference.Node;


/**
 * �������㷨�࣬���ݶ����GC Root�Ƿ�ɴ����ж϶����Ƿ�ɱ�����
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
		// node1��nextָ��node2
		node1.setNext(node2);
		// node3ָ��null����ʱnode3�ǿɻ��յĶ���
		node3 = null;
		// node2ָ��null�����Ǵ�ʱnode1��nextָ��node2������node2��Ȼ�ǿɴ�ģ����node2��ʱ�����ǿɻ��յĶ���
		node2 = null;
	}
}
