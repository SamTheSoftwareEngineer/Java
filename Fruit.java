public class Fruit extends Item {
    private String type;

    public Fruit(String type, String name, int quanity) {
        super(name, quanity);
        this.type = type;
    }
}
