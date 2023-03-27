public class NoteBook {
    private String brand;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public NoteBook(String brand, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "Бренд -'" + brand + '\'' +
                ", ОЗУ -" + ram + " ГБ" +
                ", Объем ЖД -" + storage + " ГБ" +
                ", ОС -'" + os + '\'' +
                ", Цвет -'" + color + '\'' +
                '}';
    }
}





















//public class NoteBook {
//    private int ram;
//    private int hard;
//    private String os;
//    private String color;
//
//    public NoteBook(int ram, int hard, String os, String color) {
//        this.ram = ram;
//        this.hard = hard;
//        this.os = os;
//        this.color = color;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public int getHard() {
//        return hard;
//    }
//
//    public String getOs() {
//        return os;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public void setHard(int hard) {
//        this.hard = hard;
//    }
//
//    public void setOs(String os) {
//        this.os = os;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//}
