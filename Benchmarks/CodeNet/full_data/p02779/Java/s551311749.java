import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        Set<Long> as = new HashSet<Long>();
        String ans = "Yes";
        for(int i = 0 ;i<a.length;i++){
            a[i] = sc.nextLong();
            as.add(a[i]);
        }
        if(a.length!=as.size()){
            ans = "No";
        }
        System.out.println(ans);
    }
}