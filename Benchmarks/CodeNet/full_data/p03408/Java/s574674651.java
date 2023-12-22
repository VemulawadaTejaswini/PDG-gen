import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String[] s=new String[N];
        for(int i=0;i<N;i++){
            s[i]=sc.nextLine();
        }
        int M=sc.nextInt();
        sc.nextLine();
        String[] t=new String[M];
        for(int i=0;i<M;i++){
            t[i]=sc.nextLine();
        }
        int max=0;
        for(int i=0;i<N;i++){
            int cnt=1;
            for(int k=i+1;k<N;k++){
                if(s[i].equals(s[k])){
                    cnt=cnt+1;
                }
            }
            for(int k=0;k<M;k++){
                if(s[i].equals(t[k])){
                    cnt=cnt-1;
                }
            }
            if(max<cnt){
                max=cnt;
            }
        }
        System.out.println(max);
    }
}