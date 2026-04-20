package com.tenco.single;

public class Main {

    public static void main(String[] args) {
        //우리 프로젝트 내에서 singleTon 객체를 Heap 메모리에 올려보자
        // 생성자 막아놨음 - 호출못함
        //SingleTon singleTon = new SingleTon();

        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println("1. " + singleTon1);
        System.out.println("2. " + singleTon2);
        System.out.println("----------------");

        Person person = Person.getInstance();
        System.out.println(person);

//        if (singleTon1 == singleTon2) {
//            System.out.println("같은 객체가 맞아요");
//        }

    }
}
