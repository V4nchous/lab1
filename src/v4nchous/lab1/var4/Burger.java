package v4nchous.lab1.var4;

public class Burger extends Food {
    private String size;

    public Burger(String size) {
        super("Burger");
        this.size = size;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple) arg0).getSize()); // Шаг 3
        } else
            return false;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " has been eaten");
    }

    public String toString() {
        return "A '" + size.toUpperCase() + "' " + super.toString();
    }

}
