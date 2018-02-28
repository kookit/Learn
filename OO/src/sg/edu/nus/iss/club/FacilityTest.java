package sg.edu.nus.iss.club;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class FacilityTest extends TestCase{
			
		Facility fac1 = new Facility ("room1", null);
		Facility fac2 = new Facility ("room2", "two 2");
		Facility fac3 = new Facility ("room3", "three 3");
		
	@Test
	void testGetName() {

		assertEquals ("room1", fac1.getName());
		assertEquals ("room2", fac2.getName());
		assertEquals ("room3", fac3.getName());
	}
	
	@Test
	void testGetDescription() {
		
		assertTrue (fac1.getDescription() == null);
		assertEquals ("two 2", fac2.getDescription());
		assertEquals ("three 3", fac3.getDescription());	
	}
	
	@Test
	void testFacilityString() {
	
		assertEquals ("room1", fac1.getName());
		assertNull (fac1.getDescription());
	}
	
	@Test
	void testFacilityStringString() {
		
		assertEquals ("room2", fac2.getName());
		assertEquals ("two 2", fac2.getDescription());
	}
	
	@Test
	void testShow() {
		
		fac1.show();
		fac2.show();
		fac3.show();
		assertTrue (true);
	}
}

