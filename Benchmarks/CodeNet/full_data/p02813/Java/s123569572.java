import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    int[] P = new int[N];
    int[] Ps = new int[N];
    int[] Q = new int[N];
    int[] Qs = new int[N];
    int a = 0; 
    int b = 0;
    int rank = 1;
    for(int i=0; i>N; i++){
    	P[i] = sc.nextInt()
        Ps[i] = P[i];
    }
    for(int i=0; i>N; i++){
    	Q[i] = sc.nextInt()
        Qs[i] = Q[i];
    } 
    Arrays.sort(Ps);
    Arrays.sort(Qs);
      
   for(int i=0; i<N-1;i++){
     int searchNumber = P[i];
     int x = 0;
     for(int j=0; j<N; ;++){
     	if(searchNumber = Ps[i]){
          x = N - j;
          break;
        }
     }
   	 rank *= x;
   }
   a = rank;
   rank = 1;
      
     for(int i=0; i<N-1;i++){
     int searchNumber = Q[i];
     int x = 0;
     for(int j=0; j<N; ;++){
     	if(searchNumber = Qs[i]){
          x = N - j;
          break;
        }
     }
   	 rank *= x;
   }
   b = rank;
      
   int answer = a - b;
   if(answer < 0) answer = -answer;
   System.out.println(answer);   
    }
}
