import java.util.Scanner;
public class Exercise06_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of milliseconds: ");
        long number = input.nextLong();
        System.out.println("Converted time is:\n\n" + convertMillis(number));
    }

        public static String convertMillis(long millis) {
            long totalMilliseconds = millis;

            long totalSeconds = totalMilliseconds / 1000;

            long currentSecond = totalSeconds % 60;

            long totalMinutes = totalSeconds / 60;

            long currentMinute = totalMinutes % 60;

            long totalHours = totalMinutes / 60;

            return "hrs :"+ totalHours + "\n" + "minutes:" + currentMinute + "\n" +  "sec:" + currentSecond;

        }

    }