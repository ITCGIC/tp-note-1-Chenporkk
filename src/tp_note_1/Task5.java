package tp_note_1;

import java.util.Scanner;

/**
 * Task5
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input money in Riels:");
        float getRiel = sc.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.println(getRiel+"RIELS ="+(float)(getRiel/4000)+"$");
    }
}