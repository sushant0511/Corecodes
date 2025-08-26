package com.java.testEncap;

class Call
{
	
	protected int id=10;  // encap
	String name;
	public void setId(int idd) {
		this.id = idd;  // this will not allocate a new memory . Same refence
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class TestEncap {

	public static void main(String[] args) {
		
		Call call=new Call();
		call.setId(12);
		System.out.println(call.getId());
		System.out.println(call.id);

		
		
		
		
		
		
		
	}
	
	
	
}
