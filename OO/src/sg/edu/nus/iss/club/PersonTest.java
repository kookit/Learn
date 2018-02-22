package sg.edu.nus.iss.club;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest extends ClubApplication {

	@Test
    void testEquals() {
        Person m12CHF = new Person("koo", "CHF", "");
        Person m14CHF = new Person("khoo", "CHF", "");
        assertTrue(!m12CHF.equals(null));
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Person("koo", "CHF", ""));
        assertTrue(!m12CHF.equals(m14CHF));
    }
}
