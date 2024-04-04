public abstract class Dog implements AdoptableAnimal {

    String name;
    String description;
    double price;


    public Dog() {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    abstract String getBreed();
}
