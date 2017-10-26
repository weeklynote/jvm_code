package classloader;

public class LoaderStaticWithoutFinal {
	static{
		System.out.println(".....LoaderStaticWithoutFinal...........");
	}
	public static int a;
	public static int b = 0;
	public static LoaderStaticWithoutFinal loader = new LoaderStaticWithoutFinal();
	public LoaderStaticWithoutFinal(){
		a++;
		b++;
	}

	public static void main(String[] args) {
		// ����LoaderMain.a�����¶�LoaderMain�������ʼ������׼���׶γ�ʼ����̬��
		// �����������´�ӡ�Ľ��Ϊ1,0
		// �����loader�Ĵ������ھ�̬����b֮����ô����ӡ��1,1
		System.out.println(LoaderStaticWithoutFinal.a);
		System.out.println(LoaderStaticWithoutFinal.b);
	}

}
