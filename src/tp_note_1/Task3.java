package tp_note_1;

import java.util.Scanner;

/**
 * Task3
 */
public class Task3 {
    public static void main(String[] args) {
        int hh, mm, ss;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting time to seconds.");
        System.out.print("Please input hours:");
        hh = sc.nextInt();
        System.out.print("Please input minute:");
        mm = sc.nextInt();
        System.out.print("Please input second:");
        ss = sc.nextInt();
        System.out.println("--------------------------------------------------");
        int sec= (hh*3600)+(mm*60)+ss;
        System.out.println("Number of seconds ="+hh+"*3600+"+mm+"*60+"+ss+"="+sec);
    
    }
}