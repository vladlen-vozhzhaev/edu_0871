import java.util.Scanner;
public class Auth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        if (login.equals("admin")){
            System.out.println("Логин admin принят, введите пароль");
            String password = scanner.nextLine();
            if (password.equals("123")){
                System.out.println("Доступ разрешен");
            }else {
                System.out.println("Нет доступа");
            }
        }else if (login.equals("user")){
            System.out.println("Логин user принят, введите пароль");
            String password = scanner.nextLine();
            if (password.equals("321")){
                System.out.println("Доступ разрешен");
            }else {
                System.out.println("Нет доступа");
            }
        }
        else{
            System.out.println("Нет доступа");
        }
    }
}
