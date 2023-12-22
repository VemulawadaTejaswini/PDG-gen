import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n,z,w,turn=0,num=0,xturn=0,xnum=0,ynum=0;
        n =sc.nextInt();
        z=sc.nextInt();
        w=sc.nextInt();
        int [] list = new int [n];
        for(int a=0;a<n;a++){
            list[a]=sc.nextInt();
        }
        int score = Math.abs(list[n-1]-w);
        int score2 = Math.abs(list[n-2]-list[n-1]);
        if(score>score2) System.out.println(score);
        else System.out.println(score2);
    }
}