public class Pitbull extends Dog {
    private final String breed = "Pit bull";

    public Pitbull(String name, String description, double price) {
        super.name = name;
        super.description = description;
        super.price = price;
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

    @Override
    String getBreed() {
        return this.breed;
    }
}
