package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class LightSpeed {

    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186282;
        days = 7;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.print("in " + days);
        System.out.print(" days, light will travel about....");
        System.out.print(distance + " miles.");
    }
}
