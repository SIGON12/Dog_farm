package com.company;

import java.util.Scanner;

public class Aviary {
   Scanner sc =new Scanner(System.in);
   private int id;
   private boolean isClean = false;

    public Aviary(int id, boolean isClean) {   //констр
        this.id = id;
        this.isClean = isClean;
    }

    public int getId() { // set и get
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
    public Aviary(){   // путой метод
    }
    // создание Вальеров
    public void clean_Aviary(){
        System.out.println("Вальер №: ");
        id = sc.nextInt();
        System.out.println("Вальер чистый? (да/нет):");
            String j=sc.next();
            switch(j){
                case ("да"):
                System.out.println("Чистка не требуется");
                break;
                case ("Нет"):
                System.out.println("Требуется чистка");
                break;
                default:
                    System.out.println("Неверный ввод");
            }}
    // создание массива Вальеров
    public static Aviary[] createAviaryArray (int n){
        Aviary[] arrAviary = new Aviary[n];
        for (int i = 0; i<arrAviary.length; i++){
            arrAviary[i] = new Aviary();
            arrAviary[i].createAviary();
        }
        return arrAviary;
    }

    private void createAviary() {
    }

    public void setId() {
    }
}
