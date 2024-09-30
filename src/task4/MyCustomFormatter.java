package task4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.StringJoiner;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyCustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        Throwable thrown = record.getThrown();
        if (thrown!=null){
            StringWriter sw=new StringWriter();
            thrown.printStackTrace(new PrintWriter(sw));
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(" Sana "+ LocalDate.now());
            stringBuilder.append(" Log Level "+record.getLevel());
            stringBuilder.append(" Class name "+record.getSourceClassName());
            stringBuilder.append(" message "+record.getMessage());
            stringBuilder.append(" Xatolik-> "+sw);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(" Sana "+ LocalDate.now());
        stringBuilder.append(" Log Level "+record.getLevel());
        stringBuilder.append(" Class name "+record.getSourceClassName());
        stringBuilder.append(" message "+record.getMessage());
        return stringBuilder.toString();
    }
}
