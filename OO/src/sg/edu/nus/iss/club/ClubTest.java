package sg.edu.nus.iss.club;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

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
		
		Member expectedMember = new Member ("aaa", "bbb", "-", 1);
		assertEquals(expectedMember, club.getMember(1));
		
		Member expectedMember2 = new Member ("aaa", "bbb", "-", 3);
		assertEquals(expectedMember2, club.getMember(3));
	}
	
	@Test
	void testGetMembers() {
		
		Club club = new Club();
		
		ArrayList<Member> members = club.getMembers();
		assertTrue(members.size() == 0);
		
		club.addMember("aaa", "bbb", "-");
		club.addMember("Goh", "", "Jac");
		club.addMember("koo","chee","kit");
		club.addMember("Kar", "Ming", "Trevor");
		
		//int i = 4;
		//assertEquals(i, club.getMembers().size());
		members = club.getMembers();
		assertTrue(members.size() == 4);
	}
	
	@Test
	void testRemoveMember() {
		Club club = new Club();
		
		//club.removeMember(1);
		
		Member expectedMember = new Member ("koo","chee","kit", 1);
		club.addMember("Koo", "Chee", "Kit");
		club.addMember("aaa", "bbb", "-");
		club.addMember("Goh", "", "Jac");
		club.addMember("koo","chee","kit");
		club.addMember("Kar", "Ming", "Trevor");
		
		club.removeMember(1);
		assertFalse(expectedMember.equals(getMember(1)));
		
		Member expectedMember2 = new Member ("Goh", "", "Jac", 3);
		club.removeMember(3);
		assertFalse(expectedMember2.equals(getMember(3)));		
	}
	
	@Test
	void testMemberShows() {
		assertTrue(true);
	}
}
