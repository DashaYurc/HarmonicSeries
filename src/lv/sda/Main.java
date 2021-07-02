package lv.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values you want to average: ");

        int[] ages = new int[scan.nextInt()];

        for(int i = 0; i < ages.length; i++){
            System.out.print("Enter kid age: ");
            ages[i] = scan.nextInt();
        }

        double total = 0;
        for(int i = 0; i < ages.length; i++){
            total += ages[i];
        }

        double averageAge = total / ages.length;
        System.out.print("The average age of the " + ages.length + " kids is: " + averageAge);


        /*double n = scan.nextDouble();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("Harmonic value = " + sum);*/


    }

}

