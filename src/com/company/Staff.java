package com.company;

import java.util.Scanner;

public class Staff {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String prof;
    private boolean isAvairy_dirty = false;

    public Staff(int id, String name, String prof) {
        this.id = id;
        this.name = name;
        this.prof = prof;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public boolean isAvairy_dirty() {
        return isAvairy_dirty;
    }

    public void setAvairy_dirty(boolean avairy_dirty) {
        isAvairy_dirty = avairy_dirty;
    }

    public Staff() {
    }

    public void сreatestaff() {
        System.out.println("Персонал" + "\n" + "Введите id: " + id);
        id = sc.nextInt();
        System.out.println("Введите имя: " + name);
        name = sc.next();
        System.out.println("Введите профессию: " + prof);
        prof = sc.next();
    }
    // создание массива Персонала

    public static Staff[] createStaffArray(int n) {
        Staff[] arrStaff = new Staff[n];
        for (int i = 0; i < arrStaff.length; i++) {
            arrStaff[i] = new Staff();
            arrStaff[i].createStaff();
        }
        return arrStaff;
    }

    private void createStaff() {
    }

    // создание информации массива
    public void showInfo() {
        System.out.print("ID: " + id + "Имя: " + name + "Профессия: " + prof);
    }

    // метод вывода массива Персонала
    public static void showArrayStaff(Staff[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].showInfo();
        }
    }
    public  void actions(Dogs[] arr, Staff[] arr2, Aviary[] arr3) {
        System.out.println("Введите профессию персонала (Дресировщик/ветеринар/уборщик): ");
        String j = sc.next();
        switch (j) {
            case ("Дрессировщик"):
                for (int i =0; i<arr.length;i++){
                    if (arr[i].isHungry()){
                        if(arr[i].getAge()<1){
                            if(arr[i].setHungry(false));{
                                System.out.println("Собаку с № " + arr[i].getId() +"Не требуется кормить");}
                            if(arr[i].setHungry(true)){ //else??
                                System.out.println("Собаку с № " + arr[i].getId() +"Нужно кормить кормом для щенков");
                        }
                        if (arr[i].getAge()>1 && arr[i].getAge()<8){
                            if (arr[i].setHungry(false));{
                                System.out.println("Собаку с № " + arr[i].getId() + "Не требуется кормить");}
                            if (arr[i].setHungry(true));{ //else??
                                    System.out.println("Собаку с № " + arr[i].getId() +"Нужно кормить кормом для взрослых собак");
                            }}
                        if (arr[i].getAge()>8){
                                    if (arr[i].setHungry(false));{
                                        System.out.println("Собаку с № " + arr[i].getId() + "Не требуется кормить");}
                                    if (arr[i].setHungry(true));{ // else??
                                        System.out.println("Собаку с № " + arr[i].getId() +"Нужно кормить кормом для престарелых собак");
                                    }
                                    }
                    }
                        if(arr[i].getAge()<=1 && !arr[i].isTrained()){
                            Traning_Plosh.training(arr[i]);
                        }
                    }
                    }
                    break;
            case ("ветеринар"):
                for (int i =0; i<arr.length;i++){
                    if(arr[i].isHealth() == false){
                        if (arr[i].setHealth(false));
                        System.out.println("Надо лечить");}
                    if(arr[i].isHealth()==true){
                        System.out.println("Лечение не требуется");}
                    }
                    break;
            case ("уборщик"):
                for (int i =0; i<arr3.length;i++){
                    if (arr3[i].isClean() == false){
                        System.out.println("вольер № :" + arr3[i].setId() + arr3[i].setClean(true));}

                    }
                    break;
            default:
                System.out.println("Некорректный ввод");
        }
        }
    }