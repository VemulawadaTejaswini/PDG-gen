import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int length = sc.nextInt();
        String[] ans = new String[high];

        for(int i=0; i<high; i++){
            ans[i] = sc.next();
        }

        for(int i=0; i<=length+1; i++){
            System.out.print("#");
        }

        System.out.print("¥n");

        for(int i=0; i<high; i++){
            System.out.println("#"+ans[i]+"#");
        }

        for(int i=0; i<=length+1; i++){
            System.out.print("#");
        }

        System.out.print("¥n");

    }
}