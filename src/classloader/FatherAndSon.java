package classloader;

public class FatherAndSon {

	public static void main(String[] args) {
		// ��̬����a���ڸ��ֱ࣬��ʹ�ò��ᵼ�����౻��ʼ��
		System.out.println(Father.a);
		System.out.println(Son.b);
		// ���µ��ò���������ĳ�ʼ����ԭ��ͬLoaderStaticWithFinal
		System.out.println(Son.c);
	}

}
