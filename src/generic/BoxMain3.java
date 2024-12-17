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

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        System.out.println("Double = "+doubleBox.get());

        //타입 추론: 생성하는 제네릭 타입 생략 가능
         GenericBox<Integer> integerBox2 = new GenericBox<>();
    }

}
