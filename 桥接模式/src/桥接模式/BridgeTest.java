package 桥接模式;
/*
 * 桥接模式就是把事物和其具体实现分开，是他们各自独立变化
 * 桥接的意思就是将抽象类和实现化解耦，使得两者可独立变化
 * 类似于jdbc桥drivermanager一样
 * jdbc进行数据库连接时，在各个数据库之间进行切换，不需要动太多代码
 * jdbc提供统一接口
 * 每个数据库提供各自实现，用一个叫做数据库驱动的程序来桥接就行了
 * 通过对Bridge类的调用，实现对接口sourceable的实现类sourcesub1和sourcesub2的调用
 * 
 * 这里能实现的原因就是桥持有接口的实例，然后有这个与接口相同的方法，然后在桥中的方法调用接口的同名方法
 */
public class BridgeTest {
    public static void main(String[] args) {
		Bridge bridge=new MyBridge();
		/*调用第一个对象*/
		Sourceable s1=new SourceSub1();
		bridge.setSource(s1);
		bridge.method();
		/*调用第二个对象*/
		Sourceable s2=new Sourcesub2();
		bridge.setSource(s2);
	    bridge.method();//这个method方法调用的是source.method方法	
		
	}
}
