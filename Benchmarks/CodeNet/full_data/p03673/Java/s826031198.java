import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] ai = new int[n];
        for(int i = 0;i < n;i++)    ai[i] = sc.nextInt();
        int id = 0;
        for(int i = 0;i < n;i++){
            if(i == 0)  System.out.print(ai[n-1]);
            else if(i < (n+1)/2)    System.out.print(" "+ai[n-1-2*i]);
            else if(i == (n+1)/2){
                if(n%2 == 0)    System.out.print(" "+ai[0]);
                else    System.out.print(" "+ai[1]);
            }
            else{
                if(n%2 == 0)    System.out.print(" "+ai[(i-(n+1)/2)*2]);
                else    System.out.print(" "+ai[(i-(n+1)/2)*2+1]);
            }
        }
    }
}