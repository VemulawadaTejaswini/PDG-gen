import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] a = new String[N];
        String[] b = new String[M];
        for(int i = 0;i < N;i++){
            a[i] = sc.next();
        }
        for(int i = 0;i < M;i++){
            b[i] = sc.next();
        }
        boolean can = false;
        for(int i = 0;i < N;i++){
            if(can){
                break;
            }
            if(a[i].matches(".*" + b[0] + ".*")){
                can = true;
                for(int j = 1;j < M;j++){
                    if(i + j >= N){
                        can = false;
                        break;
                    }
                    int k = i;
                    k++;
                    if(!a[k].matches(".*" + b[j] + ".*")){
                        can = false;
                        System.out.println(b[j]);
                        break;
                    }
                }
            }
        }
        if(can){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
