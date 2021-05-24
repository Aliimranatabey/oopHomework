

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA+REACT)","2 ay sürecek...","Engin Demirog","ÜCRETSÝZ");
		Product product2=new Product(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (C#+ANGULAR)","2 ay sürecek...","Engin Demirog","ÜCRETSÝZ");
		
		Product[] products= {product1,product2};
		
		for (Product product : products) {
			System.out.println(product.id+" + "+product.name+" + "+product.explanation+" + "+product.teacherName+" + "+product.charge);
			product.Register();
			
		}
		
		
		
		
		

	}

}
