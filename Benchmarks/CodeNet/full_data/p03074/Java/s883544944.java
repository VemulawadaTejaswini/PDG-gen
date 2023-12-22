import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        sc.close();
        if(n==1){
            System.out.println(1);
            return;
        }
        Integer count = 0;
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        int i=0;
        if(s[0]=='0'){
            one.add(0);
        }
        while(true){
            while(i < n && s[i]=='0'){
                count++;
                i++;
            }
            if(count > 0){
                zero.add(count);
                count = 0;
            }
            
            while(i < n && s[i]=='1'){
                count++;
                i++;
            }
            if(count > 0){
                one.add(count);
                count = 0;
            }
            if(i==n){
                break;
            }
        }
        //1010...1に合わせる
        if(s[n-1]=='0'){
            one.add(0);
        }
        int idx = 0,head = 0;
        int sum = 0;
        while(idx < zero.size() && idx < k){
            sum+=one.get(idx)+zero.get(idx);
            idx++;
        }
        sum+=one.get(idx);
        int max = sum;
        while(idx < zero.size()){
            sum = sum-zero.get(head)-one.get(head)+zero.get(idx)+one.get(idx+1);
            max = Math.max(max,sum);
            idx++;
            head++;
        }
        System.out.println(max);

    }

}