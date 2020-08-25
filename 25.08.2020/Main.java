import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        System.out.println(cars.isEmpty());
        cars.add(1, "VAZ");
        System.out.println(cars);
        cars.set(0,"Kia"); // Переназначили элемент с индексом 0
        System.out.println(cars.get(0));
        System.out.println("Количество элементов коллекции cars: "+cars.size());
        System.out.println(cars.remove(1));
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.add("Audi");
        cars.add("Audi");

        /*
        String[] cars2 = {"Kia", "VAZ", "BMW"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой элемент в массиве cars вы хотите найти?");
        String car = scanner.nextLine();
        System.out.println(cars.indexOf(car));

        for (int i = 0; i < cars2.length; i++) {
            if (cars2[i].equals(car)){
                System.out.println("Элемент найден, его индекс: "+i);
                break;
            }else if (i == cars2.length-1){
                System.out.println("Элемент не найден");
            }
        }*/

    }

}
