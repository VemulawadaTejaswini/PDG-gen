import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1;i < n/2;i++){
            if(n%i == 0)
            ans = i;
        }
        System.out.println(ans);
    }
}