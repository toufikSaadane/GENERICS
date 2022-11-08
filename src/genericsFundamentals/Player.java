package genericsFundamentals;

public abstract class Player implements PlayerInterface {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
