public class Product {
    private String brand;
    private String name;
    private String description;
    private int price;



    public Product(String brand, String name, String description, int price) {
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Clothes extends Product{
    private int size;
    private String color;

    public Clothes(String brand, String name, String description, int price, int size, String color) {
        super(brand, name, description, price);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Shoes extends Product{
    private int size;

    public Shoes(String brand, String name, String description, int price, int size) {
        super(brand, name, description, price);
        this.size = size;

    }
}
class Watches extends Product{

    public Watches(String brand, String name, int price){
        super(brand, name, price);
    }
}
class Bags extends Product{
    private String color;
    public Bags(String brand, String name, String description, int price, String color){
        super(brand, name, price);
        this.color = color;
    }
}
