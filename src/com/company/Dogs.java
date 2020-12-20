package com.company;  // 25-3 каникулы

import java.util.Scanner;

public class Dogs {
    Scanner sc =new Scanner(System.in);
    private String name;
    private int age;
    private String poroda;
    private int id;
    private boolean isHealth = false;
    private boolean isHungry = false;
    private boolean isTrained = false;
// констр
    public Dogs(int id, String name, int age, String poroda) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.poroda = poroda;

    }



    // Set и get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHealth() {
        return isHealth;
    }

    public boolean setHealth(boolean health) {
        isHealth = health;
        return health;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public boolean setHungry(boolean hungry) {
        isHungry = hungry;
        return hungry;
    }

    public boolean isTrained() {
        return isTrained;
    }
// метод тренировки
    public void setTrained(boolean trained) {
        isTrained = trained;
    }


    public Dogs() {

    }
    // создание массива собак
    public static Dogs[] createDogsArray(int n) { //ХЗ ?
        return new Dogs[0];// ? ХЗ
    }
    public static Dogs[] createDogArray (int n){
    Dogs [] arrdogs  = new Dogs[n];
    for (int i = 0; i< arrdogs.length; i++){
    arrdogs[i] =new Dogs();
    arrdogs[i].creatdog();
    }
    return arrdogs;

    }

    private void creatdog() {
    }
// создание собак
    public void createDog() {
        System.out.println("Введите id: " + id);
        id = sc.nextInt();
        System.out.println("Введите имя: " + name);
        name = sc.next();
        System.out.println("Введите породу: " + poroda);
        poroda = sc.next();
        System.out.println("Введите возраст: " + age);
        age = sc.nextInt();
        System.out.println("Дресированная собака? (да/нет): ");
//        if (sc.next().equals("да")){  // сравнивает условия
//            isTrained = true;
//            System.out.println("Нужна дресировка");
//        }else isTrained = false;
//        System.out.println("Дресировка не требуется" + "\n");
        String z= sc.next();
        switch(z) {
            case ("да"):
                System.out.println("Нужна дрессировка");
            case ("нет"):
                System.out.println("Дрессировка не требуется");
            default:
                System.out.println("Ввод некорректен");
        }
        System.out.println("Голодная собака? (да/нет): ");
//        }
//        if (sc.next().equals("да")){
//            isHungry = true;
//            System.out.println("Требуется кормление");
//        }else isHungry = false;
//        System.out.println("Кормление не требуется" + "\n");
        String q=sc.next();
        switch (q){
            case ("да"):
                System.out.println("Кормление");
            case ("нет"):
                System.out.println("Кормление не требуется");
            default:
                System.out.println("Ввод некорректен");
        }
        System.out.println("Больная собака? (да/нет): ");
        String e=sc.next();
        switch (e){
            case ("да"):
                System.out.println("Лечение");
            case ("нет"):
                System.out.println("Лечение не требуется");
            default:
                System.out.println("Ввод некорректен");
        }}
//        if (sc.next().equals("да")){
//            isHealth = true;
//            System.out.println("Требуется лечение");
//        }else isHealth = false;
//        System.out.println("Лечение не требуется" + "\n");}
   // создание информации
    public void showInfo(){
        System.out.println("ID: " + id + "\n"
                + "Имя: " + name + "\n"
                +  "Возраст: " + age + "\n"
                + "Дресировка: " + isTrained +"\n"
                + "Кормление: " + isHungry +"\n"
                + "Здоровье: " + isHealth);
    }
    // создание метода вывода информации
    public static void showArrayDogs(Dogs [] arr){
        for (int i = 0 ; i< arr.length; i++){
            arr[i].showInfo();
        }
    }}