package sg.edu.nus.iss.club;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClubTest extends Club {

	@Test
	void testAddMember() {
		
		Club club = new Club();
		Member expectedMember = new Member ("koo","chee","kit", 1);
		club.addMember("koo", "chee", "kit");
		assertEquals (expectedMember,club.getMember(1));
	}
	
	@Test
	void testGetMember() {
		
		Club club = new Club();
		
		assertNull (club.getMember(1));
		assertNull (club.getMember(0));
		assertNull (club.getMember(100));
		
		club.addMember("aaa", "bbb", "-");
		club.addMember("Goh", "", "Jac");
		club.addMember("koo","chee","kit");
		club.addMember("Kar", "Ming", "Trevor");
		
		Member expectedMember3 = new Member ("koo","chee","kit", 1);
		assertEquals (expectedMember3, club.getMember(3));
	}
}
