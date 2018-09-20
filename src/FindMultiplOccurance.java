import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FindMultiplOccurance {
    boolean found = false;
    String output = "";
    public String findMultipleOccurance(String input,String word){
        while (true) {
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println("found at "+matcher.start()+" - "+matcher.end());
                output = output + "found at "+matcher.start()+" - "+matcher.end()+ '\n';
                found = true;
            }
            if(!found){
                found = false;
            }
            return output;
        }
    }
}