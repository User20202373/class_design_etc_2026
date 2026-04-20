package com.tenco.single;

// 싱글톤 패턴으로 클래스를 설계 연습
public class Person {

    //유일한 변수 선언
    private static Person instance;

    // 생성자 호출 방지
    private Person() {

    }

    //외부에서 호출할 수 있는 메서드 생성
    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

}
