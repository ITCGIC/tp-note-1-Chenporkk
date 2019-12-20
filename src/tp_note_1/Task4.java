package tp_note_1;

import java.util.Scanner;

import tp_note_1.Task2.time;

/**
 * Task4
 */
public class Task4 {
    public static class time {int h,m,s;}
    static time start_time = new time();
    static time end_time = new time(); 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours:");
        start_time.h = sc.nextInt();
        System.out.print("Please input start minutes:");
        start_time.m = sc.nextInt();
        System.out.print("Please input start second:");
        start_time.s = sc.nextInt();
        System.out.print("Please input end hours:");
        end_time.h = sc.nextInt();
        System.out.print("Please input end minutes:");
        end_time.m = sc.nextInt();
        System.out.print("Please input end seconds:");
        end_time.s = sc.nextInt();
        int total_Sec = ((end_time.h*3600)+(end_time.m*60)+end_time.s)-((start_time.h*3600)+(start_time.m*60)+start_time.s);
        double cost = 0.05*total_Sec/60;
        System.out.println("-----------------------------------------");
        System.out.println("Total call duration:"+(int)(total_Sec/3600)+"h:"+(int)((total_Sec%3600)/60)+"m:"+(int)((total_Sec%3600)%60)+"s");
        System.out.println("Total cost of this call: "+cost+"$");
   

    }

}