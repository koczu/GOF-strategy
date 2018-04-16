package pl.sternik.as.strategy.goose;

public class Goose {
    private final String name;

    public Goose() {
        this.name = "Goose";
    }

    public Goose(String nazwa) {
        this.name = nazwa;
    }

    public void gaggle() {
        System.out.println("Gę, gę");
    }

    public void printGoose() {
        System.out.println("I'm goose: " + name);
    }

    public void swimInGoose() {
        System.out.println("I'm swimming");
    }

    public void flyInGoose() {
        System.out.println("I'm flying");
    }
}
