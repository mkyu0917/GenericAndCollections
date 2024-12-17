package generic;

public class RawTypeMain {

    public static void main(String[] args) {

        //제네릭 타입을 사용할때 타입을 명시해주지 않으면 Object가 기본으로 들어가게 되어있다.
        GenericBox integerBox = new GenericBox();

        //GenericBox<Object> integerBox = new GenericBox<>(); 권장방법

        integerBox.set(10);

        //다운캐스팅
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer=" + integer);
    }
}
