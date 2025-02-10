import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            counts.compute(str.charAt(i), (key, val) 
                  -> (val == null) ? 1 : val + 1);
        }
        int max = 0;
        char result = ' ';
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
