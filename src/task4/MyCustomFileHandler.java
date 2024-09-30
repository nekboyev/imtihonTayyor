package task4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyCustomFileHandler extends Handler {
    @Override
    public void publish(LogRecord record) {
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        int minute = localTime.getMinute();
        int soat  =localTime.getHour();
        record.setLoggerName(localDate+"_"+soat+":"+minute+".log");
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
