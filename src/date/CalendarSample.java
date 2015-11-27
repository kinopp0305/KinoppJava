package date;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendarサンプル
 */
public class CalendarSample {
    public static void main(String... args){
        Date now = new Date();
        
        Calendar c = Calendar.getInstance();
	c.setTime(now);
        //c.set(2010, 12, 22, 1, 23, 45);
	int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH) + 1;
        int d = c.get(Calendar.DAY_OF_MONTH);
        
        System.out.println("今年は" + y + "年" + m + "月" + d + "日です");
        
    }
}
