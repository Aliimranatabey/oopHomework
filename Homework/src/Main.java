

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA+REACT)","2 ay s�recek...","Engin Demirog","�CRETS�Z");
		Product product2=new Product(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C#+ANGULAR)","2 ay s�recek...","Engin Demirog","�CRETS�Z");
		
		Product[] products= {product1,product2};
		
		for (Product product : products) {
			System.out.println(product.id+" + "+product.name+" + "+product.explanation+" + "+product.teacherName+" + "+product.charge);
			product.Register();
			
		}
		
		
		
		
		

	}

}
