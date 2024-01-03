package easy;

public class Easy14LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // flow
        // flight

        if (strs == null || strs.length == 0) {
            return "";
        }

        String result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                // flower -> flowe -> flow -> flo -> fl
                result = result.substring(0, strs.length - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

        System.out.println("flower".indexOf("flow"));
    }
}
