package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj){
        //ㅈㅔ네릭 메서드 이 하나의 메서드에서만 제네릭을 사용가능
        System.out.println("Generic method print: " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t){
        //ㅈㅔ네릭 메서드 이 하나의 메서드에서만 제네릭을 사용가능
        System.out.println("bound print: " + t);
        return t;
    }

}
