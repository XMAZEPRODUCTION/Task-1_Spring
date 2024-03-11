public class Cat {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name=name;
    }
}
