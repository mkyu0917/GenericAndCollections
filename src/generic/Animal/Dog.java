package generic.Animal;

public class Dog extends Animal{


    public Dog(String name, int size) {
        super(name, size);
        System.out.println("나는 자식 개");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

}
