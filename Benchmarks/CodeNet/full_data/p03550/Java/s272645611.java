import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n,z,w,turn=0,num=0,xturn=0,xnum=0,ynum=0;
        n =sc.nextInt();
        z=sc.nextInt();
        w=sc.nextInt();
        int [] list = new int[n];
        for(int a=0;a<n;a++){
            list[a]=sc.nextInt();
        }
        for(int a=num;a<n;a++){
            if(turn ==0){
                if(list[a]>z){
                    z=list[a];
                    xturn=a;
                    xnum++;
                    turn =1;
                }
            }
            else if(turn ==1){
                if(list[a]<w){
                    w=list[a];
                    ynum=a;
                    turn =0;
                }
            }
            else if (xturn<n&&turn==0&&xnum!=0&&num==n){
                a =ynum;
                turn=1;
            }
        }
        int score = Math.abs(z-w);
        System.out.println(score);
    }
}