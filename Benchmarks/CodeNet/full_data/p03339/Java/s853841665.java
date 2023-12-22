import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        String S = sc.next();
        char[] A = S.toCharArray();

        int count = 0;
        int sum[];
        sum = new int[N];

        for(int i = 0; i < N;i++){
            
            for(int n = 0;n < i;n++){
                if(A[n] == 'W'){
                    count++;
                }
            }
            for(int reader = N - i; reader < N; reader++){
                if(A[reader] == 'E'){
                    count++;
                }
            }
            sum[i] = count;
        }

        int min = sum[0];
            for(int i = 1;i < N;i++){
                int n = sum[i];
                if(n < min){
                min = n;
                }
            }

        System.out.println(min);
    }
}

    
    