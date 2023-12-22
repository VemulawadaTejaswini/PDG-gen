import java.util.*;
public class Main {
	public static void main(String[] args){
    
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] A = new int[N];
   int[] B = new int[N];
  int[] C = new int[N];

   for(int i=0;i<N;i++){
     A[i] = sc.nextInt();   
	}
for(int i=0;i<N;i++){
     B[i] = sc.nextInt();   
	}
for(int i=0;i<N-1;i++){
     C[i] = sc.nextInt();   
	}

int result = B[0];

for(int i=1;i<N;i++){
     if(B[i] == B[i-1]+1){
             result += B[i]+C[i];
         }

         }
}
System.out.println(result);
    }

