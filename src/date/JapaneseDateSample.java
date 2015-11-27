package date;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoField.*;

/**
 * JapaneseDateサンプル
 */
public class JapaneseDateSample {
    public static void main(String... args){
        // 西暦を設定
        JapaneseDate date1 = JapaneseDate.of(1973, 5, 23);
        System.out.println(date1);  //=> Japanese Showa 48-05-23
        System.out.println(date1.getChronology());  //=> Japanese
        System.out.println(date1.getEra());  //=> Showa
        System.out.println(date1.get(ERA));  //=> 1
        System.out.println(date1.get(YEAR_OF_ERA));  //=> 48
        System.out.println(date1.get(YEAR));  //=> 1973
        System.out.println(date1.get(MONTH_OF_YEAR));  //=> 5
        System.out.println(date1.get(DAY_OF_MONTH));  //=> 23

        // 和暦を設定
        JapaneseDate date2 = JapaneseDate.of(JapaneseEra.HEISEI, 18, 4, 24);
        System.out.println(date2);  //=> Japanese Heisei 18-04-24
        System.out.println(date2.format(DateTimeFormatter.ISO_DATE));  //=> 2006-04-24
        System.out.println(date2.format(DateTimeFormatter.BASIC_ISO_DATE));  //=> 20060424
        
        // 現在日付を設定
        JapaneseDate date3 = JapaneseDate.now();
        System.out.println(date3);  //=> Japanese Heisei 27-11-27
    }

}
