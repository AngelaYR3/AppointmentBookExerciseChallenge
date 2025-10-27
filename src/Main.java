import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File schedules = new File("Schedules.txt"); //importing file
        Scanner scan = new Scanner(schedules); //adds scanner for said file

        int index = 0; //index for what line we're on in the file
        boolean[][] schedule = new boolean[8][60]; //creates an array for the schedule (lines that are not divisible by 9)
        int count = 0; //count for the number of reservations fulfilled

        while (scan.hasNextLine()) { //while the file has next line
            index++; //updates line num
            String line = scan.nextLine(); //stores entire line
            Scanner lineScanner = new Scanner(line); //scanner for just this one line

            if (index % 9 == 0) { //every 9th line
                AppointmentBook appointmentBook = new AppointmentBook(schedule); //appointmentbook var for the schedule (which should be done by here since it should've ran 8 times before)
                int[] nums = new int[3]; //list for the nums
                int begin = 0; //initializes the variables based off assignment details
                int end = 0;
                int duration = 0;
                for (int i = 0; i < 3 && lineScanner.hasNextInt(); i++) { //checks each int on the int line
                    nums[i] = lineScanner.nextInt(); //sets nums list to the line
                }
                begin = nums[0]; //assigns the details based off of num positions
                end = nums[1];
                duration = nums[2];

                for (int i = begin; i < end; i++){ //checks for each hour (inclusive) between the begin and end hour for the free block
                    if (appointmentBook.findFreeBlock(i,duration) != -1) { // if the free block exists
                        count++; //fulfills the reservation and increases the count
                    }
                }
            } else { //every not 9th line
                for (int period = 0; period < 8; period++){ //for every line (periods)
                    for (int minute = 0; minute < 60 && lineScanner.hasNextBoolean(); minute++){ // for every boolean in the line (minute of period)
                        schedule[period][minute] = lineScanner.nextBoolean(); //sets up the schedule for the reservation checking
                    }
                }
            }
        }
        System.out.println(count); //shows final fulfilled reservations
    }
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
//test case 2
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
//    }
//
//}