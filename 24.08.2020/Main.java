/** В нашей вселенной все животные умеют издавать звуки */
public class Main {
    public static void main(String[] args) {
        Cat.catMethod();
    }
}
interface AnimalInterface{
    void speak();
}

abstract class Animal implements AnimalInterface{
    protected String nickname;
    protected int age;
    protected String breed;

    public Animal(String nickname, int age, String breed) {
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() { return breed; }

    public void setBreed(String breed) { this.breed = breed; }
}

class Cat extends Animal{
    public static int catsCounter;
    public Cat(String nickname, int age, String breed) {
        super(nickname, age, breed);
        catsCounter++;
    }

    public static void catMethod(){
        System.out.println("Статический метод кота");
    }

    @Override
    public void speak(){
        System.out.println(this.nickname+": Meow");
    }

}

class Dog extends Animal{

    public Dog(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    @Override
    public void speak(){
        System.out.println(this.nickname+": Woof");
    }
}

class Horse extends Animal{
    public Horse(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    void run(){
        System.out.println("Игого я побежал(а)");
    }

    @Override
    public void speak() {
        System.out.println("IGOGO");
    }
}
