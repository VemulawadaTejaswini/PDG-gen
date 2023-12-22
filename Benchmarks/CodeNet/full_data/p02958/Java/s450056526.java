import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=0;
        for(int i=1; i<=N; i++){
            int P = sc.nextInt();
            if(P != i){
                cnt++;
            }
        }
        if(cnt==0 || cnt==2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}