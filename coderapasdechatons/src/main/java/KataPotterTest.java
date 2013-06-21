import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class KataPotterTest {
	
	@Test
	public void test(){
		KataPotter subject = new KataPotter();
		
		double price = subject.getPrice(Arrays.asList("1"));
		assertThat(price,equalTo(8.0));
	}
	
	@Test
	public void testTwiceSameBook(){
		KataPotter subject = new KataPotter();
		
		double price = subject.getPrice(Arrays.asList("1", "1"));
		assertThat(price,equalTo(16.0));
	}

}
