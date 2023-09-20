public class BuddyInfo {
    private final String name;
    private final String address;
    private final int phoneNumber;

    public BuddyInfo() {
        name = "";
        address = "";
        phoneNumber = 0;
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo tony = new BuddyInfo("Tony", "address", 0);
        System.out.println("Hello my name is " + tony.getName());
    }
}
