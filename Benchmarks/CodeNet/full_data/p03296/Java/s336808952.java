import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt() + 1;
        }

        int count = 0;
        if( N > 2){
            for(int i = 0; i < N - 3; i++){
                if(a[i] == a[i+1]){
                    a[i+1] = (a[i+2] + 1)  % 10000; 
                    count++;
                }
            }
            if(a[N-3] == a[N-2] || a[N-2] == a[N-1]){
                count++; 
            }
        }
        else{
            if(a[0] == a[1]){
                count = 1;
            }
        }

        System.out.println(count);


    }
}