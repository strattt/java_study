import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * User: che
 * Date: 13.02.14
 * Time: 9:47
 */
public class LogGenerator {
    public static final String ERROR = "ERROR";
    public static final String WARN = "WARN";
    public static final String INFO = "INFO";

    //метод выводящий в лог информацию в виде:  [13.02.2014 09:58:18] [ERROR] text
    public static void write(String s, String level) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String curDate =  dateFormat.format(calendar.getTime());
        System.out.println("[" + curDate +"] ["+level+"] " + s);
    }

    public static void write(String s) {
        write(s, INFO);
    }
}
