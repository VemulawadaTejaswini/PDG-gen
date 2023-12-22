import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
 
        int L[];
        L = new int[1000];
 
        for(int i = 0;i < N;i++){
            L[i] = sc.nextInt();
        }
        int D[];
        D = new int[1000];
        D[0] = 0;
 
        for(int n = 1;n < N;n++){
            D[n] = D[n-1] + L[n-1];
        }
        int count = 0;
        for(int m = 0;m < N;m++){
            if(D[m] <= X){
                count++;
            }
        }
 
        System.out.println(count);
 
        
    }
}