package recycler;

/**
 * ���ü������㷨��
 * @author liujin
 *
 */
public class ReferenceCounter {
	
	public Object instance;
	private byte[] data = new byte[1024 * 1024 * 2];

	public static void main(String[] args) {
		ReferenceCounter ref1 = new ReferenceCounter();
		ReferenceCounter ref2 = new ReferenceCounter();
		// ref1������ref2
		ref1.instance = ref2;
		// ref2������ref1�����γ���һ�ֻ������ã���ref1������ref2������£�Ҳ���ܶ�ref2���л��գ���֮��Ȼ��
		// �⽫�����ڴ��޷������գ�ͨ��GC��ӡ��Ϣ��������ʱ�ڴ��ǿ��Ի��յġ����Java����ʹ�õ����ֻ����㷨��
		ref2.instance = ref1;
		ref1 = null;
		ref2 = null;
		System.gc();
	}

}
