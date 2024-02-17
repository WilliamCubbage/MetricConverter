import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    double lengthMeter = 0;
        do
        {
        System.out.println("Enter your length in meters: "); //prompt user for length in meters
            if (in.hasNextDouble())
            {
            lengthMeter = in.nextDouble();
            break;
            }
            else
            {
            in.nextLine();
            System.out.println("You input was invalid, please try again."); //invalid input loop
            }
        }
            while (true);

        double lengthMile = lengthMeter * 0.000621371;
        double lengthFeet = lengthMeter * 3.28084;
        double lengthInch = lengthMeter * 39.3701;

        System.out.println("You length in meters was "+ lengthMeter + "."); // Listing the conversions underneath
        System.out.println("You length in miles is " + lengthMile + ".");
        System.out.println("You length in feet is " + lengthFeet + ".");
        System.out.println("You length in inches is " + lengthInch + ".");

    }
}


