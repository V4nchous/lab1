package v4nchous.lab1.var4;

import java.util.Scanner;

public class MainApplication {

    @SuppressWarnings("unchecked")

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];

        int itemsSoFar = 0, cheeseSoFar = 0, applesSoFar = 0, burgersSoFar = 0;

        for (String arg : args) {
            String[] parts = arg.split("/");

            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                cheeseSoFar++;
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
                applesSoFar++;
            } else if (parts[0].equals("Burger")) {
                breakfast[itemsSoFar] = new Burger(parts[1]);
                burgersSoFar++;
            }

            itemsSoFar++;
        }

        for (Food item : breakfast) {
            if (item != null)
                item.consume();
            else
                break;
        }

        System.out.println("What dish would you like to count?");

        Scanner scanner = new Scanner(System.in);
        String dishSelect = scanner.nextLine();

        if (dishSelect.equals("Apple")) {
            System.out.println("There are " + applesSoFar + " Apples");
        } else if (dishSelect.equals("Cheese")) {
            System.out.println("Cheese are " + cheeseSoFar + " pieces of cheese");
        } else if (dishSelect.equals("Burger")) {
            System.out.println("There are " + burgersSoFar + " Burgers");
        } else throw new Exception("Invalid dish");


        System.out.println("Всего хорошего!");
    }
}


