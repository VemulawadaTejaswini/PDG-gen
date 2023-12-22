import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int s[] = new int[M];
        int c[] = new int[M];
        for(int i=0; i<M; i++){
            s[i] = in.nextInt();
            c[i] = in.nextInt();
        }

        boolean flag = true;
        int num[] = new int[N];

        for(int i=0; i<N; i++){
            num[i] = -1;
        }

        for(int i=0; i<M; i++){
            if(s[i]-1 > N){
                flag = false;
                break;
            }
            if(num[s[i]-2] == -1){
                num[s[i]-2] = c[i];
            }else{
                if(num[s[i]-2] != c[i]){
                    flag = false;
                    break;
                }
            }
        }

        //
        if(num[0] == 0) flag = false;
        if(num[0] == -1) num[0] = 1;
        if(num[1] == -1) num[1] = 0;
        if(num[2] == -1) num[2] = 0;
        
        if(flag){
            System.out.printf("%d", num[0]*100+num[1]*10+num[2]);
        }else{
            System.out.print("-1");
        }
    }
}