/** В этой вселенной люди живут максимум до 120 лет.
 * Минимальный возраст 0 лет.
 * Максимальное количество здоровья 100ед. */
public class Main {
    public static void main(String[] args) {
        int medKit = 50;
        Person olga = new Person("Ольга","Иванова",42,null);
        Person oleg = new Person("Олег","Иванов",20,olga);
        System.out.println(oleg.getMyMotherName());
    }
}

class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp;
    private Person mother;

    public Person(String name, String surname, int age, Person mother){
        this.name = name;
        this.lastname = surname;
        this.age = (age>120 || age<0)?0:age;
        this.hp = 100;
        this.mother = mother;
    }

    public String getName(){return this.name;}
    public void setName(String name){
        this.name = name;
    }

    public void setHp(int value){
        if (this.hp+value>100) this.hp = 100;
        else this.hp += value; // a = a+5; a+=5;
        //this.hp = (this.hp+value>100)?100:this.hp+value;
    }

    void sayHi(){
        System.out.println("Привет");
    }
    void getInfoAboutYou(){
        System.out.println("Меня зовут: "+this.name+"" +
                " | Мой возраст: "+this.age+" | Здоровье: "+this.hp);
    }
    public String getMyMotherName(){
        return this.mother.name;
    }
}
