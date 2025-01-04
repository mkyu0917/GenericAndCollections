package generic.test.ex3;

import generic.Animal.Animal;
import generic.Animal.Cat;
import generic.Animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이전달
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류 발생안함

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        //Animal animal = dogHospital.bigger(new Dog("멍멍이2", 200)); 타입이 animal이기 때문에 animal로 받아야함;
        //Dog로 받기 위해선 다운캐스팅을 해야됨
        //Dog biggerDog = (Dog)dogHospital.bigger(new Dog("멍멍이2", 200));
        //Cat biggerCat = (Cat)dogHospital.bigger(new Cat("냐옹이2", 500));

        //System.out.println("biggerDog=" + biggerDog);
        //System.out.println("biggerCat=" + biggerCat);
    }
}
