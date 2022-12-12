package v4nchous.lab1.var4;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public String toString() {
        return "bla-bla-bla-bla";
    }
}

