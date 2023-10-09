public class Q12Time {

    public static int calculateAngle(int hours, int minutes) {
        int angle = 0;
        // Calculate the angle of the hour hand counterclockwise from 12 o'clock
        hours = hours % 12;
        double hour_Angle = hours*30 ;

        // Calculate the angle of the minute counterclockwise hand from 12 o'clock
        double minute_Angle = minutes * 6;

        // Calculate the absolute angle between the hour and minute hands
        if (hour_Angle <= minute_Angle) { //for problem 2.30 and 4.41
            angle = (int) (360 - Math.abs(minute_Angle - hour_Angle));
        } else {
            angle = (int) Math.abs(hour_Angle - minute_Angle);
        }
        return angle;
    }

    public static void main(String[] args) {
        //Test the Q12Time Class
        int[][] testTimes = {
                {9, 0}, {3, 0}, {18, 0}, {1, 0}, {2, 30}, {4, 41}
        };

        for (int[] time : testTimes) {
            int hours = time[0];
            int minutes = time[1];
            int angle = calculateAngle(hours, minutes);
            System.out.printf("Angle for %02d:%02d is %d°%n", hours, minutes, angle);
        }
    }
}
