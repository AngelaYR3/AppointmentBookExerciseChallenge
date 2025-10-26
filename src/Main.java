import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File schedules = new File("Schedules.txt");
        Scanner scan = new Scanner(schedules);

        for (int i = 0; i < schedules.length(); i += 9) {
            
        }

//        boolean[][] schedule = new boolean[8][60]; //creating a 2D boolean array with 8 rows (0..8 periods) & 60 columns (0...59 minutes) to make the period 2 table
//        AppointmentBook a = new AppointmentBook(schedule); //initialize an appointmentbook object and pass the schedule (array) into it

    }


//test case 1
//
//        for(int i = 10; i < 15; i++) schedule[1][i] = true; //schedule[1] means index 1, aka period 2. We set true for int i=10 until i<15 is false
//        for(int i = 30; i < 45; i++) schedule[1][i] = true;
//        for(int i = 50; i < 60; i++) schedule[1][i] = true;
//        a.printPeriod(2);
//
//        System.out.println(a.findFreeBlock(2,15)); //returns 30 to indicate that a 15-minute block in period 2, starting with minute 30, is available.
//        System.out.println(a.findFreeBlock(2,9)); //whenever there are multiple blocks that satisfy the requirement, the earliest starting minute is returned.
//        System.out.println(a.findFreeBlock(2,20)); //would return -1, since no 20-minute block of available minutes exists in period 2.
//        AppointmentBook b = new AppointmentBook(schedule);
//
////test case 2
//        for (int i = 25; i < 30; i++) schedule [1][i] = true;
//        for (int i = 0; i < 15; i++) schedule [2][i] = true;
//        for (int i = 41; i < 60; i++) schedule [2][i] = true;
//        for (int i = 5; i < 30; i++) schedule [3][i] = true;
//        for (int i = 44; i < 60; i++) schedule [3][i] = true;
//        int period = 2;
//        while (period < 5) {
//            System.out.println("Period: " + period);
//            b.printPeriod(period);
//            period++;
//        }
//        b.printPeriod(4);
//        System.out.println(b. makeAppointment(2, 4, 22));
//        b.printPeriod(4);
//
//        System.out.println(b. makeAppointment(3, 4, 3));
//        b.printPeriod(3);
//
//        System.out.println(b. makeAppointment(2, 4, 30));
    }

}