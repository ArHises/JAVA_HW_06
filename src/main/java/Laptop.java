import java.util.Objects;

public class Laptop {
    private final String company;
    private final String type;
    private final String serialNumber;

    private final String color;

    private final String processor;
    private final int RAM;

    private double price;

    public Laptop(String company, String type, String serialNumber, String color, String processor, int ram, double price){
        this.company = company;
        this.type = type;
        this.serialNumber = serialNumber;
        this.color = color;
        this.processor = processor;
        RAM = ram;
        this.price = price;
    }
    public String getCompany(){
        return this.company;
    }
    public String getType(){
        return this.type;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }

    public String getColor(){
        return this.color;
    }
    public String getProcessor(){ return this.processor; }
    public int getRAM(){
        return this.RAM;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(serialNumber, laptop.serialNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(company, type, serialNumber, color, processor, RAM, price);
    }

    @Override
    public String toString() {
        return "laptop{" +
                "company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", RAM=" + RAM + "GB"+
                ", price=" + price +
                '}';
    }
}
