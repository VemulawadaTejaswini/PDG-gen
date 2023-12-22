import java.util.Scanner;

public class Main {
    private static boolean isNegative(int x){
        return x < 0 ? true : false;
    }
    private static String getDifOfMinus2Base(String s1, String s2) {
        int l = s1.length();
        int currentRealValue[] = new int[l];
        String ans = "";
        int isKuri = 0; //繰り上がり:1 繰り下がり:-1 無し:0
        for (int i = l - 1; i >= 0; --i) {
            int isEven = (i % 2 == 0) ? -1 : 1; //1:iが奇数 -1:iが偶数
            if (s1.charAt(i) == '1') {
                currentRealValue[i]++;
            }
            if (s2.charAt(i) == '1') {
                currentRealValue[i]++;    
            }
            currentRealValue[i]+= (isKuri * isEven);
            if(currentRealValue[i] > 1) {
                isKuri = 1;
            }
            if (currentRealValue[i] == 1 && currentRealValue[i] == 0) {
                isKuri = 0;
            }
            if (currentRealValue[i] < 0) {
                isKuri = -1;
            }
        }
        for (int i = 0; i < l; ++i) {
            String pal = String.valueOf(currentRealValue[i] % 2);
            ans += pal;
        }
        return ans;
    }
    private static String getCutPrimal0Array(String s1) {
        int iterator;
        for (int i = 0;true;++i) {
            if (s1.charAt(i) == '1' || i == s1.length() - 1) {
                iterator = i;
                break;
            }
            return s1.substring(iterator, s1.length());
        }
    }
    public static void main(String[] args) { 
        Scanner sIn = new Scanner();
        int n = sIn.nextInt();
        String s = "";
        boolean neg = isNegative(n);
        String s_pos = "";
        String s_neg = "";
        if (neg) {
            n = -n;
        }
        for(int i = 30; i >= 0; --i) {
            if (i % 2 == 0) {
                s_pos += (n >> i) & 1;
                s_neg += '0';
            }
            if (i % 2 == 1) {
                s_neg += (n >> i) & 1;
                s_pos += '0';
            }
        }
        if (neg) {
            s = getDifOfMinus2Base(s_neg, s_pos);
        }
        else {
            s = getDifOfMinus2Base(s_pos, s_neg);
        }
        s = getCutPrimal0Array(s);
        System.out.println(s);
    }
}