import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] atgc = {'A', 'T', 'G', 'C'};
        
        int length = 0;
        int tmpLength = 0;
        boolean checkNow = false;
        for(int i = 0;i < s.length;i++) {
            // ATGCかどうかチェック
            boolean preCheckNow = false;
            for(int j = 0;j < 4;j++) {
                if(s[i] == atgc[j]) preCheckNow = true;
            }
            if(preCheckNow) {
                if(checkNow) tmpLength++;
                else {
                    checkNow = true;
                    tmpLength++;
                }
            }
            else {
                if(checkNow) {
                    checkNow = false;
                    length = length < tmpLength ? tmpLength : length;
                    tmpLength = 0;
                }
            }
            
            checkNow = preCheckNow;
        }
        if(checkNow) length = length < tmpLength ? tmpLength : length;
        
        System.out.println(length);
    }
}
