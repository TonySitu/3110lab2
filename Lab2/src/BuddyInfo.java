public class BuddyInfo {
    private final String name;
    private final String address;
    private final String phoneNumber;

    public BuddyInfo() {
        name = "";
        address = "";
        phoneNumber = "";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo tony = new BuddyInfo("Tony", "address", "613");
        System.out.println("Hello my name is " + tony.getName());
    }
}
