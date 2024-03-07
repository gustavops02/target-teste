public class ReverseString {

    public static void printReverse(String str) {
        String reversed = reverse(str);
        System.out.println(reversed);
    }
    private static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
