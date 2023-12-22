import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

//
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ed = 0;
        int ans=0;
        if(M==0){
            ans = (int) Math.pow(10, N-1);
            if(ans==1){ans=0;}
            System.out.println(ans);
        }
        else
        {

            int[][]cond=new int[M+1][3];
            for (int i=1;i<=M;i++){
                cond[i][1]=sc.nextInt();
                cond[i][2]=sc.nextInt();
            }
        //二桁以上で尚且一桁目０であるといっている場合
            for(int i=1;i<=M;i++){
                if ((cond[i][1]!=1)&&(cond[i][2]==0)){
                    ans=-1;
                    ed = 1;
                    System.out.println(ans);
                    break;
                }
            }
        //cond間で矛盾する言及を行っている場合
            for (int i=1;i<=M-1;i++) {
                for (int j=i+1;j<=M;j++) {
                    if((cond[i][1]==cond[j][1])&&(cond[i][2]!=cond[j][2])){
                        ans=-1;
                        ed = 1;
                        System.out.println(ans);
                        break;
                    }
                }
            }
        //最小値を出力出来る場合はここで出力することとする
            int endflg=0;
            if(ed==0){
                loop:for (int i=(int) Math.pow(10, N-1)-1;i<=(((int)Math.pow(10, N))-1);i++) {
                    endflg=0;
                    for (int j=1;j<=M;j++) {
                        if(((i/(int)Math.pow(10,4-cond[j][1]-1)*(int)Math.pow(10,4-cond[j][1]-1))-
                        (i/(int)Math.pow(10,4-cond[j][1])*(int)Math.pow(10,4-cond[j][1])))==(cond[j][2])*(int)Math.pow(10,4-cond[j][1]-1)){
                            endflg=endflg+1;
                        }
                    if(endflg==M){
                        System.out.println(i);
                        break loop;
                        }
                    }
                }
            }
        }
    }
}


