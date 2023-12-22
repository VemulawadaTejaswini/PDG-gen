import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),l=sc.nextInt();
        int minabs=Integer.MAX_VALUE;
        int ans=0,finalans=0;
        for(int i=0;i<n;i++){
            ans+=l+i;
        }
        for(int i=0;i<n;i++){
            if(minabs>Math.abs(l+i)){
                finalans=ans-(l+i);
                minabs=Math.abs(l+i);
            }
        }
        System.out.println(finalans);
    }

}