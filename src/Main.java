public class Main {
    public static void main(String[] args) {
        Add address = new Add("Bishkek", "Togolok Moldo");


        two objectA = new two("A", 1, address, Status.ACTIVE);
        Three objectB = new Three("B", 2, address, Status.INACTIVE, "info for B");
        Three objectC = new Three("C", 3, address, Status.SUSPENDED, "info for C");


        System.out.println("Кыргызстан " + objectA.getName() + "номер:" + objectA.getId() + ", Address: " + objectA.getAddress().getCity() + ", Status: " + objectA.getStatus());
        System.out.println("Москва " + objectB.getName() + "номер: " + objectB.getId() + ", Address: " + objectB.getAddress().getCity() + ", Status: " + objectB.getStatus() + ", Info: " + objectB.getExtraInfo());
        System.out.println("Казань " + objectC.getName() + "номер: " + objectC.getId() + ", Address: " + objectC.getAddress().getCity() + ", Status: " + objectC.getStatus() + ", Info: " + objectC.getExtraInfo());


        objectA.displayInfo();
        objectA.displayInfo(82);

        objectB.displayInfo();
        objectB.displayStatus();

        objectC.displayInfo();
        objectC.displayStatus();
    }
}
