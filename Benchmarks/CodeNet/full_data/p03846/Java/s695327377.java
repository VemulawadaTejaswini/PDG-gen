import java.util.*;

public class Main {

    static long MOD = 1000000007;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        if(n%2==1)set1.add(0);

        boolean avable = true;

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(!set1.contains(a)){
                set1.add(a);
            }else if(!set2.contains(a)){
                set2.add(a);
            }else{
                avable = false;
            }
        }

        if(n%2==0){
            for(int i=1;i<n;i+=2){
                if(!set2.contains(i))avable=false;
            }
        }else {
            for(int i=0;i<n;i+=2){
                if(!set2.contains(i))avable=false;
            }
        }
        long ans=1;
        for(int i=0;i<n/2;i++){
            ans = (ans*2)%MOD;
        }

        if(avable)System.out.println(ans);
        else System.out.println(0);




    }
}
