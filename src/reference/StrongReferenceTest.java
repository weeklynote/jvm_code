package reference;
import java.util.ArrayList;
import java.util.List;

// ǿ����
public class StrongReferenceTest {

	public static void main(String[] args) {
		List<Node> list = new ArrayList<>();
		// OOM
		for(int i = 0; i < 100000; i++){
			list.add(new Node("Node" + i));
		}
	}

}
