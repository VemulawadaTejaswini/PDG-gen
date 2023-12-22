import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] s = new char[n][];
        for(int i = 0;i < n;i++) s[i] = sc.next().toCharArray();
        long[][] charCountTable = new long[n][26];
        
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < 10;j++) charCountTable[i][s[i][j] - 'a']++;
        }

        long result = 0;
        boolean[] isChecked = new boolean[n];
        for(int i = 0;i < n - 1;i++) {
            if(isChecked[i]) continue;
            long count = 1;
            for(int j = i + 1;j < n;j++) {
                if(sameXAsY(charCountTable[i], charCountTable[j])) {
                    isChecked[j] = true;
                    count++;
                }
            }
            result += ((count) * (count - 1) / 2);
        }

        System.out.println(result);
    }
    
    private static boolean sameXAsY(long[] x, long[] y) {
        boolean same = true;
        for(int i = 0;i < x.length;i++) {
            if(x[i] != y[i]) {
                same = false;
                break;
            }
        }
        
        return same;
    }
    
}
