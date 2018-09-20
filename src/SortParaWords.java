import java.util.*;
import java.util.Arrays;
public class SortParaWords {
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public String sortParaWords(String str){
        String strFinal = "";
        ArrayList<String> list = new ArrayList<>();
        String[] strTemp = str.split(" ");
        for(int i=0;i<strTemp.length;i++) {
            String outputString = sortString(strTemp[i]);
            list.add(outputString);
        }
        String str1 = String.join(" ", list);
        return str1;
    }


}

//        String listString = Arrays.toString(list.toArray());
