import java.util.ArrayList;
import java.util.Arrays;

public class TransposeWords {
    public static String transpose(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        char temp;
        for(int i=0;i<tempArray.length/2;i++){
            temp = tempArray[i];
            tempArray[i] = tempArray[tempArray.length-1-i];
            tempArray[tempArray.length-1-i] = temp;
        }

        return new String(tempArray);
    }
    public String transposeWords(String input){
        String strFinal = "";
        ArrayList<String> list = new ArrayList<>();
        String[] strTemp = input.split(" ");
        for(int i=0;i<strTemp.length;i++) {
                String outputString = transpose(strTemp[i]);
                list.add(outputString);
            }
            String str1 = String.join(" ", list);
            return str1;
        }
}
