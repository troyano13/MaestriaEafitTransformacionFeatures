package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import main.Index;
import main.Product;


public class IndexTest {


	Product p1 = new Product(10,"carmen",9/*B-paramsIVIP*/

/*Code injected by: ProductVIP-AlterIndexVIPTest*/
,true
/*Code injected by: ProductVIP-AlterIndexVIPTest*/
    
			  /*B-paramsIStart*/

/*Code injected by: ProductStar-AlterIndexTest*/
,12
/*Code injected by: ProductStar-AlterIndexTest*/
  );

	Index index =new Index();
	
	/*B-testIndex*/

/*Code injected by: ProductVIP-AlterIndexVIPTest2*/
@Test
	public void verificacionVip() {
		assertEquals(true, p1.isVip());

	}
/*Code injected by: ProductVIP-AlterIndexVIPTest2*/


/*Code injected by: ProductStar-AlterIndexTest2*/
@Test
	public void verificacionStar() {
		assertEquals(12, p1.getStar());

		p1.setStar(10);
		assertEquals(10, p1.getStar());
	}
/*Code injected by: ProductStar-AlterIndexTest2*/

	
	@Test
	public void verificacionId() {
		assertEquals(10, p1.getId());

		p1.setId(10);
		assertEquals(10, p1.getId());

	} 

	@Test
	public void verificacionProductName() {
		assertEquals("carmen", p1.getName());

		p1.setName("Teresa");
		assertEquals("Teresa", p1.getName());

	}

	@Test
	public void verificacionProductPrice() {
		assertEquals(9, p1.getPrice());

		p1.setPrice(10);
		assertEquals(10, p1.getPrice());

	}	


	@Test
	public void outProduct() {
		PrintStream save_out=System.out;
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		System.out.print(p1.getName() + " - price " + p1.getPrice());
		assertEquals("carmen - price 9",out.toString());
		System.setOut(save_out);
	}

	@Test
	public void outWelcome() {
		String Welcom="/*BCP-store-name*/";
		
		PrintStream save_out=System.out;
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		System.out.print(Welcom);
		assertEquals(Welcom,out.toString());
		System.setOut(save_out);
	}
}