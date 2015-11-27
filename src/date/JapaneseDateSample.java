package date;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

/**
 * JapaneseDateサンプル
 */
public class JapaneseDateSample {
    public static void main(String... args){
        JapaneseDate date1 = JapaneseDate.of(1973, 5, 23);
        System.out.println(date1);

        JapaneseDate date2 = JapaneseDate.of(JapaneseEra.HEISEI, 18, 4, 24);
        System.out.println(date2);
    }

}
