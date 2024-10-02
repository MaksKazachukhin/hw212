public class Three extends two {
    private String extraInfo;

    public Three(String name, int id, Add address, Status status, String extraInfo) {
        super(name, id, address, status);
        this.extraInfo = extraInfo;
    }

    public String getExtraInfo() {
        return extraInfo;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Extra Info: " + extraInfo);
    }
}
