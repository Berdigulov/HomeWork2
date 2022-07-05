package com.company;

public class Main {

    public static void main(String[] args) {
        weather(generateRandomAge(), 23);
        weather(generateRandomAge(), 10);
        weather(12, -10);
        weather(15, 3);
        weather(50, -14);


    }

    public static void weather (int age , int temperature){

        String permission = "����� ���� ������";
        String refuse = ("����������� ����");

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 35){
            System.out.println(permission);
        }else if (age < 20 && temperature >= 0 && temperature <= 28 ){
            System.out.println(permission);
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            System.out.println(permission);
        }else
            System.out.println(refuse);


    }
    public static int generateRandomAge(){
        int a = (int) (Math.random()*(10+1)) - 60;
        return a;
    }
}
