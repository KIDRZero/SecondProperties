package �Ž�ģʽ;
/*
 * �Ž�ģʽ���ǰ�����������ʵ�ַֿ��������Ǹ��Զ����仯
 * �Žӵ���˼���ǽ��������ʵ�ֻ����ʹ�����߿ɶ����仯
 * ������jdbc��drivermanagerһ��
 * jdbc�������ݿ�����ʱ���ڸ������ݿ�֮������л�������Ҫ��̫�����
 * jdbc�ṩͳһ�ӿ�
 * ÿ�����ݿ��ṩ����ʵ�֣���һ���������ݿ������ĳ������ŽӾ�����
 * ͨ����Bridge��ĵ��ã�ʵ�ֶԽӿ�sourceable��ʵ����sourcesub1��sourcesub2�ĵ���
 * 
 * ������ʵ�ֵ�ԭ������ų��нӿڵ�ʵ����Ȼ���������ӿ���ͬ�ķ�����Ȼ�������еķ������ýӿڵ�ͬ������
 */
public class BridgeTest {
    public static void main(String[] args) {
		Bridge bridge=new MyBridge();
		/*���õ�һ������*/
		Sourceable s1=new SourceSub1();
		bridge.setSource(s1);
		bridge.method();
		/*���õڶ�������*/
		Sourceable s2=new Sourcesub2();
		bridge.setSource(s2);
	    bridge.method();//���method�������õ���source.method����	
		
	}
}
