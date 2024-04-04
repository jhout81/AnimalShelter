public class Cat implements AdoptableAnimal {
    String name;
    String description;
    double price;

    public Cat(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String getDescription() {
        this.description = description;
        return description;
    }

    @Override
    public double getPrice() {
        this.price = price;
        return price;
    }
}
