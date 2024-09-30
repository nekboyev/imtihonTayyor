package task2;

import java.time.LocalDate;
import java.time.Month;

public class Main2 {
    public static void main(String[] args) {
        LocalDate from=LocalDate.of(2019, Month.MARCH,1);
        LocalDate to=LocalDate.of(2024,Month.SEPTEMBER,30);
        long hoursOfWork=0;
        while (to.isAfter(from)){
            Month month = from.getMonth();
            if (month.getValue()==6){
                hoursOfWork+=6;
            } else if (month.getValue()==7) {
                hoursOfWork+=9;
            }
            from=from.plusDays(1);
        }
        System.out.println("hoursOfWork: "+hoursOfWork);
    }
}
