package servletpro.com.pro.dao;

public class Test extends Parrent {
	private String name;
	
@Override
	public String toString() {
		return "Test [name=" + name + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
		
	}

public Test() {
	
	this("jitendra");
}

public Test(String string) {
	super("12345","4750 tone");
	this.name=string;
}


}
