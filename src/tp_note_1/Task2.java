package tp_note_1;
import java.util.Scanner;
/**
 * Task2
 */
public class Task2 {
    public static class  time {int hh, mm, ss;}
    public static time timeConvertor(int sec) {
        time t=new time();
        t.hh = sec / 3600;
        t.mm = (sec % 3600) / 60;
        t.ss = (sec % 3600) % 60;
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting seconds into formated H:M:S");
        System.out.print("Input number of seconds:");
        int getSec = sc.nextInt();
        time t1 = new Task2.time();
        t1 = timeConvertor(getSec);
        System.out.println("Time corresponding to "+getSec+"seconds is "+t1.hh+":"+t1.mm+":"+t1.ss+".");
    }

    
}