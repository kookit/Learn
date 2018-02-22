package sg.edu.nus.iss.club;

public class Club {

	private static final int ARRAY_SIZE_INCREMENT = 10;

    private int    numMembers = 0;
    private int    count = 0;
    private Member members[] = new Member [ARRAY_SIZE_INCREMENT];

    public Member getMember (int memberNum) {
        if ((memberNum < 1) || (memberNum > numMembers)) {
            return null;
        }
        return members[memberNum - 1];
    }

    public Member[] getMembers () {
        Member[] arr = new Member[count];
        int j = 0;
        for (int i = 0; i < numMembers; i++) {
            if (members[i] != null) {
                arr[j++] = members[i];
            }
        }
        return arr;
    }

    public Member addMember (String surname, String firstName,
                                             String secondName) {
        ensureArraySize ();
        numMembers++;
        Member m = new Member (surname, firstName, secondName,
                                                   numMembers);
        members[numMembers - 1] = m;
        count++;
        return m;
    }

    public void removeMember (int memberNum) {
        if ((memberNum < 1) || (memberNum > numMembers)) {
            return;
        }
        if (members[memberNum-1] != null) {
            members[memberNum-1] = null;
            count--;
        }
    }

    public void showMembers () {
        Member arr[] = getMembers();
        for (int i = 0; i < arr.length; i++) {
            arr[i].show ();
        }
    }

    public void ensureArraySize () {
        if (numMembers >= members.length) {
            Member newMembers[];
            int newSize = numMembers + ARRAY_SIZE_INCREMENT;
            newMembers = new Member[newSize];
            for (int i = 0; i < numMembers; i++) {
                newMembers[i] = members[i];
            }
            members = newMembers;
        }
    }
}
