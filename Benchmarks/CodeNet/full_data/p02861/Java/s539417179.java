import java.nio.file.Path;
import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int townx[] = new int[n];
    static int towny[] = new int[n];
    public static void main(String []args) {
        for(int i =0;i < n;i++){
            townx[i] = sc.nextInt();
            towny[i] = sc.nextInt();
        }

        int kaizyo = roop(n);
        int countpath = n-1;//一回に通る道の数        
        int allpath = n*(n-1)/2;//一つの図の道の合計数
        int gopath = countpath * kaizyo/allpath; //一つの道を通る合計数

        double pathlength[] = new double[allpath];//町間の距離を入れておく配列
        int count = 1;
        int check = 0;
        for(int j=0; j < n;j++){
            for(int k=count;k<n;k++){
                int difx = (townx[j] -townx[k])*(townx[j] -townx[k]);
                int dify = (towny[j] -towny[k])*(towny[j] -towny[k]);
                pathlength[check] = Math.sqrt(difx+dify);
                check++;
            }
            count++;
        }

        double result = 0;
        for(int m=0;m<allpath;m++){
            result += pathlength[m];
        }

        double average = result*gopath/kaizyo;

        System.out.println(average);
    }

    static int roop(int n){
        int answer = 1;
        for(int a=1;a <= n;a++){
            answer *= a;
        }
        return answer;
    }
}