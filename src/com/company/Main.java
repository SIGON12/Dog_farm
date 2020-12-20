package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dogs[] arrdogs = Dogs.createDogsArray( 4);
        Dogs.showArrayDogs(arrdogs);
        Staff[] staff = Staff.createStaffArray(3);
        Aviary[] aviary = Aviary.createAviaryArray(4);
        Staff.actions(arrdogs, staff, aviary);
    }
}
