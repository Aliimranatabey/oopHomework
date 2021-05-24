
public class Product {
	Product(int id,String name,String explanation,String teacherName,String charge ){
		this.id=id;
		this.name=name;
		this.explanation=explanation;
		this.teacherName=teacherName;
		this.charge=charge;
		
		
	}
	int id;
	String name;
	String explanation;
	String teacherName;
	String charge;
	
	
	
	public void Register(){
		
		System.out.println("KAYIT OLUNDU");
	}

}
