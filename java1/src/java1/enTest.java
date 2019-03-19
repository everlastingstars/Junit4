package java1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class enTest {
	
	private static en en1=new en();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain() {
		en1.Cal(13);
		assertEquals("YES!",en1.getResult());
	}
	
	@Test
	public void testMain1() {
		en1.Cal(50);
		assertEquals("YES!",en1.getResult());
	}
	
	@Test
	public void testMain2() {
		en1.Cal(4);
		assertEquals("NO!",en1.getResult());
	}
	@Test
	public void testMain3() {
		en1.Cal(34);
		assertEquals("NO!",en1.getResult());
	}
	@Test
	public void testMain4() {
		en1.Cal(199);
		assertEquals("NO!",en1.getResult());
	}
}
