import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt()-1;
        }
        int frag=0;
        for(int i=0;i<N;i++){
            if(A[i]!=i){

                if(frag>=2||A[A[i]]!=i){
                    System.out.println("NO");
                    return;

                }else{
                    frag++;
                }
            }
        }
        System.out.println("YES");







    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
