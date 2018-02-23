package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {

	//private static final int ARRAY_SIZE_INCREMENT = 10;

    private int    numMembers = 0;
    //private int    count = 0;
    //private Member members[] = new Member [ARRAY_SIZE_INCREMENT];
    private ArrayList<Member> members = new ArrayList<Member>();
    
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

    //public void ensureArraySize () {
    //    if (numMembers >= members.length) {
    //        Member newMembers[];
    //        int newSize = numMembers + ARRAY_SIZE_INCREMENT;
    //        newMembers = new Member[newSize];
    //        for (int i = 0; i < numMembers; i++) {
    //            newMembers[i] = members[i];
    //        }
    //        members = newMembers;
    //    }
    //}
}
