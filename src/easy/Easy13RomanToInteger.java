package easy;

import java.util.HashMap;
import java.util.Map;

public class Easy13RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolValueMap = new HashMap<>();
        symbolValueMap.put('I', 1);
        symbolValueMap.put('V', 5);
        symbolValueMap.put('X', 10);
        symbolValueMap.put('L', 50);
        symbolValueMap.put('C', 100);
        symbolValueMap.put('D', 500);
        symbolValueMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            // case: IV -> 5(V) > 1(I)
            if (i > 0 && symbolValueMap.get(s.charAt(i)) > symbolValueMap.get(s.charAt(i - 1))) {
                // 2 *  .... -   1: we already added one, 2: IV = 5 - 1 = 4
                result += symbolValueMap.get(s.charAt(i)) - 2 * symbolValueMap.get(s.charAt(i - 1));
            } else {
                result += symbolValueMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("CCXLVIII"));
    }
}
