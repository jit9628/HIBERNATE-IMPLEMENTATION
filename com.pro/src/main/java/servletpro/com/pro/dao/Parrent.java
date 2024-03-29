package servletpro.com.pro.dao;

public class Parrent {
	
	private String value;
	@Override
	public String toString() {
		return "Parrent [value=" + value + ", qty=" + qty + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	private String qty;
	
	public Parrent(String value,String qty) {
		this.value=value;this.qty=qty;
	}
	

}
