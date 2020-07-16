import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {


    public static void main(String[] args) {
        String criteria = "Criteria1";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(criteria);
        if(m.find()) {
            int x = Integer.parseInt(m.group(0));
            System.out.println(x);

        }

    /**String Operation*/

    String a= "ABC";
    a.toLowerCase();
    a+="def";
        System.out.println("String is : "+a);

    }
}
