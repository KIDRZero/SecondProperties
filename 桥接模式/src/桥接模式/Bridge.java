package 桥接模式;
/*
 * 定义一个桥，持有sourceable的一个实例
 * 一种设计模式，就是定义一个方法a，然后在方法内部调用另一个实例的方法a，经常出现，切记
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
