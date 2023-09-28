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
        buddyList.remove(buddyToBeRemoved);
    }

    public int getAddressSize() {
        return buddyList.size();
    }

    public static void main(String[] args) {
        BuddyInfo tony = new BuddyInfo("Tony", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(tony);
        addressBook.removeBuddy(tony);
        //This is an edit from github website
    }
}
