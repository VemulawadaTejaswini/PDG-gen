import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int ans = 0;

        for(int i=0; i<=100; i++){
            if((C+B*i)%A == 0){
                ans = 1;
            }
        }

        if(ans==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}