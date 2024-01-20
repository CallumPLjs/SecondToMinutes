
public class Main {
    public static void main(String[] args) {
        System.out.println("Converted : " + getDurationString(15760));
        System.out.println("Converted : " + getDurationString(0, 75));
    }

    public static String getDurationString(int totalSeconds) {
        String result = "";
        if (totalSeconds >= 0) {
           int totalMinutes = totalSeconds / 60;
           int hours = totalSeconds / 3600;
           int minutes = totalMinutes % 60;
           int seconds = totalSeconds % 60;
           result =  hours + "h " + minutes + "m " + seconds + "s";
        } else {
            result = "Invalid value";
        }
        return result;
    }

    public static String getDurationString(int minutes, int seconds) {
        String result = "";

        if (minutes >= 0 && (seconds >=0 && seconds <= 59)) {
            int totalSeconds = (minutes * 60) + seconds;
            result = getDurationString(totalSeconds);
        } else {
            result = "Invalid values";
        }

        return result;
    }
}