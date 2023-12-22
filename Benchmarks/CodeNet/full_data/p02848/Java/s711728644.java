import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        n = (char)n;
        String s = sc.next();

        char[] arr = s.toCharArray();

        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i=0; i<s.length(); i++){
            char tmp = arr[i];
            int idx = str.indexOf(tmp);
            idx += n;
            arr[i] = alpha[idx];
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            sb.append(arr[i]);
        }
        System.out.println(sb);

    }
}