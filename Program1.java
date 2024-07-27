/*

Q.1 There is an interesting walk around the clock.There is a path which represents a circle, and there are 12 points along its side representing 1,2,3...12 as it is observed on a clock.The distance between two consecutive points is measured as 5 clock-minutes (cmins). One Complete round of circle is 60 clock-minutes.
Let us assume there are two friends A and B who are stationed at 12 Clock point. They both must walk In the clock-wise direction, and then Continue to walk until they cross each other.
They both must start walking with different speeds.
They both must maintain their respective walking speed all along the journey.
You have to find at what point along the clock-path will they meet each other after they start walking.
'Write a program which:
1.Time taken by A to cover 5 cmins = x mins
2. Time taken by B to cover 5 cmins y mins
3. Outputs the clock-minutes (measured from 12 o-clock) at which they will cross each other along the path.

*/
import java.util.Scanner;
class ClockMeetingPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time taken by A to cover 5 clock-minutes (x mins): ");
        double x = sc.nextDouble();

        System.out.print("Enter the time taken by B to cover 5 clock-minutes (y mins): ");
        double y = sc.nextDouble();

        double speedA = 5 / x;
        double speedB = 5 / y;

        double relativeSpeed = Math.abs(speedA - speedB);

        double timeToMeet = 60 / relativeSpeed;

        double meetingPoint = (speedA * timeToMeet) % 60;

        System.out.println("They will meet at clock-minutes after starting. : " + meetingPoint);

    }
}

/* Output :-

Enter the time taken by A to cover 5 clock-minutes (x mins): 567.67
Enter the time taken by B to cover 5 clock-minutes (y mins): 45.78
They will meet at clock-minutes after starting. : 5.263178064343062

*/
