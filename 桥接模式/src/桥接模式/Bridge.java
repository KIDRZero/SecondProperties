package �Ž�ģʽ;
/*
 * ����һ���ţ�����sourceable��һ��ʵ��
 * һ�����ģʽ�����Ƕ���һ������a��Ȼ���ڷ����ڲ�������һ��ʵ���ķ���a���������֣��м�
 */
public abstract class Bridge {
     private Sourceable source;
     
     public void method(){
    	 source.method();
     }

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
     
}
