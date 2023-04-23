package lesson2;

import java.util.Scanner;

public class Lesson1Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("a");
        int a = scan.nextInt();

        System.out.println("b");
        int b = scan.nextInt();

        int sum=0;
        for (int i=a; i<=b; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }}


