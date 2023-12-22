import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] freq = new int[26];
        int[] oddNums = new int[s.length()];

        oddNums[0] = 1;
        freq[s.charAt(0) - 'a']++;
        
        for (int i = 1; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] % 2 == 0) oddNums[i] = oddNums[i - 1] + 1;
            else oddNums[i] = oddNums[i - 1] - 1;

            freq[s.charAt(i) - 'a']++;
        }

        if (oddNums[oddNums.length - 1] == 0 || oddNums[oddNums.length - 1] == 1) System.out.println(1);
        else System.out.println(oddNums[oddNums.length - 1]);
    }
}
