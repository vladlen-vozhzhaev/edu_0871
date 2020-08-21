public class Methods {
    public static void main(String[] args) {
        getChange(38);
    }
/*    static void getChange(int money){
        if (money>=10){
            System.out.println(10);
            money = money - 10;
            getChange(money);
        }else if (money>=5){
            System.out.println(5);
            money = money - 5;
            getChange(money);
        }else if (money>=2){
            System.out.println(2);
            money = money-2;
            getChange(money);
        }else if (money>=1){
            System.out.println(1);
            money = money-1;
            getChange(money);
        }else{
            System.out.println("Больше денег не дам!");
        }
    }*/
    static void getChange(int money){
        int change = 0;
        if (money>=10) change = 10;
        else if (money>=5) change = 5;
        else if (money>=2) change = 2;
        else if (money>=1) change = 1;
        else System.out.println("Больше денег не дам!");

        if (change > 0){
            System.out.println(change);
            getChange(money-change);
        }
    }
}
