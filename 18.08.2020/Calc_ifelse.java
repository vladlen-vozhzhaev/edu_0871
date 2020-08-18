import java.util.Scanner;
public class Calc_ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число");
        float b = scanner.nextFloat();
        System.out.println("Вы можете:\n" +
                "1 - Сложение(+)\n" +
                "2 - Вычитание(-)\n" +
                "3 - Умножение(*)\n" +
                "4 - Деление(/)\n" +
                "5 - Остаток от деления(%)");
        int operator = scanner.nextInt();
        float result = 0;
        if (operator == 1) result = (a+b);
        else if(operator == 2) result = (a-b);
        else if(operator == 3) result = (a*b);
        else if (operator == 4)
            if(b==0) System.out.println("Делить на 0 нельзя");
            else  result = (a/b);
        else System.out.println("Неизвестный оператор");
        System.out.println("Результат:"+(result));
    }
}
        
