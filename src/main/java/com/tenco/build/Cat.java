package com.tenco.build;

public class Cat {

    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    private Cat(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;


    }

    // 내부 클래스
    public static class Builder {

        private String name;
        private int age;

       public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Cat build(){
            return new Cat(this);
        }

    }
}
