import java.util.regex.*;
public class CountOccurance {
    int count =0;
    public int countOccurance(String str,char character){
        String s=Character.toString(character);
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
        count++;
        }
        return count;
    }
}
