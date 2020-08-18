import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 682;
        System.out.println("Первое число: "+(a-a%100)/100);
        System.out.println("Второе число: "+(a%100-a%10)/10);
        System.out.println("Третье число: "+(a%10));
    }
}
