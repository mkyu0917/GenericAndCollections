package generic.test.ex3;

import generic.Animal.Cat;
import generic.Animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        //다른타입을 넣어보면 타입 오류 발생
        //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이전달
        // dogHospital.set(cat); // 매개변수 체크되어 컴파일 오류발생

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        // Animal animal = dogHospital.bigger(new Dog("멍멍이2", 200)); //타입이 animal이기 때문에 animal로 받아야함;
        //다운 케스트팅이 필요없어짐
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));

    }
}
