package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Club {

    private int    numMembers = 0;
    private ArrayList<Member> members = new ArrayList<Member>();
    private HashMap<String, Facility> facilities = new HashMap<String, Facility>(); 
    
    public Member getMember (int memberNum) {
        Iterator<Member> i = members.iterator();
        while (i.hasNext()) {
        	Member m = i.next();
        	if (m.getMemberNumber() == memberNum);
        		return m;
        }
        return null;
    }

    public ArrayList<Member> getMembers () {
        return new ArrayList<Member> (members);
    }

    public Member addMember (String surname, String firstName,
                                             String secondName) {
    	numMembers++;
    	Member m = new Member (surname, firstName, secondName, 
    			numMembers);
    	members.add(m);
    	return m;
    }

    public void removeMember (int memberNum) {

       Member m = getMember(memberNum);
       if (m !=null) {
    	   members.remove(m);
       }
    }

    public void showMembers () {
        Iterator<Member> i = members.iterator();
        while (i.hasNext()) {
        	i.next().show();
        }
    }

    public Facility getFacility(String name) {
    	return facilities.get(name);
    }
    
    public List<Facility> getFacilities (){
    	
    	return new ArrayList<Facility>(facilities.values());
    }
    
    public void addFacility (String name, String description) {
        if (name == null) {
            return;
        }
        Facility f = new Facility (name, description);
        facilities.put (name, f);
    }
    
    public void showFacilities () {
    	  Iterator<Facility> i = getFacilities().iterator ();
          while (i.hasNext ()) {
              i.next().show ();
          }
    }
    
    public void removeFacility(String name) {
    	facilities.remove (name);
    }
    
}
