package string;

/**
 * Stringのサンプル
 */
public class StringSample {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "JAVA";
        String s3 = "java";
        String s4 = "361-0055";
        
        // equalsの例
        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        } else {
            System.out.println("s2とs3は等しくない");            
        }
        
        // equalsIgnoreCaseの例
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3は大文字小文字を区別しなければ等しい");
        } else {
            System.out.println("s2とs3は大文字小文字を区別しなくても等しくない");
        }
        
        // lengthの例
        System.out.println("s1の長さは" + s1.length() + "です");

        // isEmptyの例
        if (s1.isEmpty()) {
            System.out.println("s1は空文字です");
        } else {
            System.out.println("s1は空文字ではありません");
        }
        
        // substringの例
        System.out.println("文字列s2の2文字目以降は" + s2.substring(1));
        System.out.println("文字列s2の2～3文字目以降は" + s2.substring(1, 3));
        
        // matchの例
        if (s4.matches("^[0-9]{3}[\\-]?[0-9]{4}$")) {
            System.out.println("s4は郵便番号です");
        } else {
            System.out.println("s4は郵便番号ではありません");
        }
    }
}
