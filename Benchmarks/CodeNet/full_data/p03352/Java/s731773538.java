import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x = Integer.parseInt(sc.next());
         int ans = 1;
         for(int i =1;i*i<=x;i++){
             ans = Math.max(ans,i*i);
         }
         System.out.println(ans);
    }
}