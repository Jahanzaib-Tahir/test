import java.security.MessageDigest;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InstantCheck {

    public static void main(String[] args) {

        int length = 10;
          final int  hoursForSchedulerSchedule  = 2;
          final long convertedHoursToMiliSeconds  =  hoursForSchedulerSchedule * 60 * 60 *1000;
        List<Student> Arr = new ArrayList<Student>();
        Arr.add(new Student(1,"Hello"));
        Arr.add(new Student(2,"Jahanzaib"));
        Arr.add(new Student(3,"Aqib"));


        Stream.of("Hello","Jahanzaib","Mughal","Mughal","Monday").filter(text->text.startsWith("M")).distinct().collect(Collectors.toList());


        boolean useLetters = true;
        boolean useNumbers = false;
        UUID uniqueKey = UUID.randomUUID();

        System.out.println("Converted mili seconds "+convertedHoursToMiliSeconds);


    }
    public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }

        do {
            //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++workDays;
            }
        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return workDays;
    }
}
