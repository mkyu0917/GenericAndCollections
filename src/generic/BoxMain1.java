package generic;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringbox = new StringBox();
        stringbox.set("hello");
        String str = stringbox.get();
        System.out.println("str = "+ str);
    }
}
