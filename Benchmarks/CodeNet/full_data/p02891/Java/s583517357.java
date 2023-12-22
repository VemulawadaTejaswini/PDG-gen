import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        long num = check(s+s+s);
        long num2 = check(s+s);
        if(k==1){
            System.out.println(check(s));
        }
        else{
            System.out.println((num-num2)*(k-2) + num2);
        }
    }

    static long check(String s){
        int len = s.length();
        String pre = "aaa";
        long num = 0;
        int count = 1;
        for(int i=0;i<len;i++){
            String now = s.substring(i, i+1);
            if(pre.equals(now)){
                count++;
            }
            else{
                num += count/2;
                count=1;
            }
            pre = now;
        }
        num += count/2;
        return num;
    }
}
