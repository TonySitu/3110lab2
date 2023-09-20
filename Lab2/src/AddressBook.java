import java.util.*;
public class AddressBook {
    private final List<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddyToBeRemoved) {
        buddyList.removeIf(i -> i.equals(buddyToBeRemoved));
    }

    public static void main(String[] args) {
        BuddyInfo tony = new BuddyInfo("Tony", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(tony);
        addressBook.removeBuddy(tony);
    }
}
