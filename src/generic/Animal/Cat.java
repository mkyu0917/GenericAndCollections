package generic.Animal;

public class Cat extends Animal{


    public Cat(String name, int size) {
        super(name, size);
        System.out.println("나는 자식 고양이");
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
