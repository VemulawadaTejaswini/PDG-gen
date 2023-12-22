import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

      	int min = A*(N-1)+B;
      	int max = A+B*(N-1);
     
      	if(A>B){
        System.out.println(0);
        }
      
    else if(N == 1 && A!=B){
          System.out.println(0);
        }
        // 出力
        else{
          System.out.println(max-min+1);
        }
    }
}