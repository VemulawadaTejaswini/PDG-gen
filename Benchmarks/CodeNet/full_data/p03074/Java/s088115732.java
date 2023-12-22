import java.util.*;
import java.io.*;

public class Main {

    private static int solver(String str, int k){
        int start = 0;
        int end=0;
        int order = 0;
        char stat = '1';

        int dist = 0;
        // ----
        while(order<=k && end<str.length()){
            if(str.charAt(end)!=stat){
                order++;
                stat = str.charAt(end);
                while(end<str.length() && str.charAt(end)==stat){
                    end++;
                }
            }else{
                end++;
            }
        }
        dist = Math.max(dist, end - start);

        while(end<str.length()) {
            char startStat = str.charAt(start);
            while (start < str.length() && str.charAt(start) == '1') {
                start++;
            }
            while (start < str.length() && str.charAt(start) == '0') {
                start++;
            }
            end++;
            for(int i= end; i<str.length(); i++){
                if(str.charAt(i)=='0'){
                    end++;
                }
            }
            for (int i = end+1; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                        end++;
                }
            }
            dist = Math.max(dist, end - start);

        }

        return dist;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(solver(in.next(), k));
    }
}
