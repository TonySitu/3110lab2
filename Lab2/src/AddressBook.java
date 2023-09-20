import java.util.ArrayList;
public class AddressBook {
    private final ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        String name = buddy.getName();
        buddyList.removeIf(i -> i.getName().equals(name));
    }
}
