package generic;

public class BoxMain3 {

    public static void main(String[] args) {

        //생성 시점의 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        //integerBox.set("문자100"); Integer만 허용
        System.out.println("integer = "+integerBox.get());

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        System.out.println("str = " + stringBox.get());

    }

}
