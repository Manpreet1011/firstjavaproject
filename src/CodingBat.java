import java.lang.constant.Constable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingBat {
    public static void main(String[] args) {
        String str = "xxbreadyy";
        System.out.println(getSandwich(str));

    }


    public static String getSandwich(String str) {
        Pattern p = Pattern.compile("bread");
        Matcher m = p.matcher(str);
        String str1 = "";
        int x = 0, i = 0;
        while (m.find()) {

            if (i == 0) {
                i = m.end();
                continue;
            }
            if (i != 0)
                x = m.start();
        }
        if ((i != 0) && (x != 0))
            str1 = str.substring(i, x);
        return str1;
    }

}