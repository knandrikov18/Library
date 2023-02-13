public class Reader {
    private String name;
    private String address;
    private String EGN;

    public Reader(){
        this.name = "Ivan";
        this.address = "Slaveikov Mahala";
        this.EGN = "0221094573";
    }

    public Reader(String name, String address, String EGN) {
        this.name = name;
        this.address = address;
        this.EGN = EGN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", EGN='" + EGN + '\'' +
                '}';
    }
}