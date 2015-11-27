package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Dateサンプル
 */
public class DateSapmle {
    public static void main(String... args){
        Date now = new Date();
	System.out.println(now);  //=> Fri Nov 27 18:51:05 JST 2015
	System.out.println(now.getTime());  //=> 1448617865228
        
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String s = f.format(now);
	System.out.println(s); //=> 2015/11/27 18:54:26
        
        SimpleDateFormat f1 = new SimpleDateFormat("yyyyMMdd"); //=> 2015/11/27 18:54:26
	String s1 = f1.format(now);
	System.out.println(s1); //=> 20151127
    }
}
