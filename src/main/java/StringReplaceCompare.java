import java.util.Scanner;

public class StringReplaceCompare {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcome to java", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {

        s = s.replace(" ", "");
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {

            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }
}
