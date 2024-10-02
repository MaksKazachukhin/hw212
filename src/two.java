import static java.lang.Character.getName;
public class two extends one {
    private int id;
    private Add address;
    private Status status;

    public two(String name, int id, Add address, Status status) {
        super(name);
        this.id = id;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Add getAddress() {
        return address;
    }

    public Status getStatus() {
        return status;
    }


    public void displayInfo() {
        System.out.println("Name: " + getName() + ", ID: " + id + ", Status: " + status);
    }

    public void displayInfo(int additionalId) {
        System.out.println("Name: " + getName() + ", ID: " + id + ", Additional ID: " + additionalId + ", Status: " + status);
    }

    public final void displayStatus() {
        System.out.println("Status: " + status);
    }
}
