//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        for(int i = 30; i < 44; i++) schedule[1][i] = true;
        for(int i = 50; i < 59; i++) schedule[1][i] = true;
        a.printPeriod(2);
//       a.printPeriod(3);
        a.findFreeBlock(2,15);
    }
}