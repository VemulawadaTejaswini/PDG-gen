
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s  = sc.next();

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        int len = 0;
        while(len < s.length()){
            if(s.charAt(len) == '1'){
                int sublen = 0;
                while(s.charAt(len+sublen) == '1'){
                    sublen++;
                    if(len + sublen == s.length()){
                        break;
                    }
                }
                one.add(sublen);
                len += sublen;
            } else {
                int sublen = 0;
                while(s.charAt(len+sublen) == '0'){
                    sublen++;
                    if(len + sublen == s.length()){
                        break;
                    }
                }
                zero.add(sublen);
                len += sublen;
            }
        }

        if(zero.size() <= k){
            System.out.println(s.length());
            System.exit(0);
        }

        int max = 0;
        for(int i = 0;i <= zero.size() - k;i++){
            if(s.charAt(0) == '1'){
                int sum = 0;
                for(int j = 0;j < k;j++){
                    sum += one.get(i+j);
                    sum += zero.get(i+j);
                }
                if(i + k < one.size()) {
                    sum += one.get(i + k);
                }
                max = Math.max(max, sum);
            } else {
                int sum = 0;
                for(int j = 0;j < k;j++){
                    if(i + j < one.size()) {
                        sum += one.get(i + j);
                    }
                    sum += zero.get(i+j);
                }
                if(0 <= i - 1) {
                    sum += one.get(i-1);
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
