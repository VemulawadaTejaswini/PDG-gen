import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> as = new HashSet<Integer>();
        String ans = "Yes";
        for(int i = 0 ;i<a.length;i++){
            a[i] = sc.nextInt();
            as.add(a[i]);
        }
        if(a.length!=as.size()){
            ans = "No";
        }
        System.out.println(ans);
    }
}