import java.util.*;
public class AddressBook {
    private final List<BuddyInfo> buddyList;

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

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
