import java.util.Scanner;

public class Main {
    static String key = "15051499783199060";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String K = sc.next();

        System.out.println(checkInf(S, K));
    }

    public static String checkInf(String S, String K){
        long count = 0;
        for(int i = 0; i < S.length(); i++){
            int val = S.charAt(i) - '0';
            if(val == 1)
                count++;
            else {
                if(K.compareTo(key) > 0 && val == 2){
                    while(i < S.length()){
                        int val1 = S.charAt(i) - '0';
                        if(val1 != 1)
                            return String.valueOf((char) ('0' + val));
                        i++;
                    }
                    return String.valueOf((char) ('0' + val));
                }
                return String.valueOf((char) ('0' + val));
            }
            if(K.compareTo(String.valueOf(count)) == 0)
                return String.valueOf((char)('0' + val));

        }
        return null;
    }
}
