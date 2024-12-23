package ravi;
class Emp{
	int id;
	String name;
	int sal;
	String address;
	String company;
	public Emp(int id, String name, int sal, String address, String company) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + ", company=" + company
		
				+ "]";
	}
}

public class vip {

	public static void main(String[] args) {
    Emp e1 = new Emp(101,"pavan",80000,"hyd","hcl");
	System.out.println(e1);
	Emp e2 = new Emp(102,"vayu",85000,"pune","wipro");
	System.out.println(e2);
	Emp e3 = new Emp(103,"shiva",90000,"hyd","tcl");
	System.out.println(e3);
	Emp e4 = new Emp(104,"ravi",95000,"hyd","cog");
	System.out.println(e4);
	}
		
		
		
	}

