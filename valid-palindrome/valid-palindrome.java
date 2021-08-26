import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean isPalindrome(String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        StringBuilder str = new StringBuilder();
        Matcher m = p.matcher(s);
        while (m.find()) {
            str.append(m.group().toLowerCase(Locale.ROOT));
        }

        StringBuilder rev = new StringBuilder();
        rev.append(str).reverse();
        if(rev.toString().equals(str.toString())){
            return true;
        }else{
            return false;
        }
    }
}