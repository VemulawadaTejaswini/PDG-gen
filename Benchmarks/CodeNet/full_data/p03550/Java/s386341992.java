import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n,w,z;
        n = sc.nextInt();
        w = sc.nextInt();
        z = sc.nextInt();
        int [] list = new int [2];
        for(int a=0;a<n;a++){
            if(a==n-2) list[0] = sc.nextInt();
            else if(a==n-1) list[1] = sc.nextInt();
            else {
                int num = sc.nextInt();
            }
        }
        int score = Math.abs(list[1]-z);
        int score2 = Math.abs(list[0]-list[1]);
        if(score>score2) System.out.println(score);
        else if(score<=score2)System.out.println(score2);
    }
}