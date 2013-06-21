import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;




public class KataPotterTest {
	
	@Test
	public void test(){
		KataPotter subject = new KataPotter();
		
		double price = subject.getPrice();
		assertThat(price,equalTo(8.0));
	}

}
