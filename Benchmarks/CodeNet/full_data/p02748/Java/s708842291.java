import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
        int M = sc.nextInt();
        int aList[] = new int[A];//aの値段
        int bList[] = new int[B];//bの値段
        int x[] = new int[M];
        int y[] = new int[M];
        int c[] = new int[M];
        int answer = 0;
        
        for(int i = 0;i < A; i++){
          aList[i] = sc.nextInt();
        }
      	for(int i = 0;i < B; i++){
          bList[i] = sc.nextInt();
        }      	
        for(int i = 0;i < M; i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
          c[i] = sc.nextInt();
        }
        answer = aList[x[0] - 1] + bList[y[0] - 1] - c[0];
      	for(int i = 1;i < M; i++){
          if(aList[x[i] - 1] + bList[y[i] - 1] - c[i] <= answer){
            answer = aList[x[i] - 1] + bList[y[i]-1] - c[i];
          }
        }
      	
        Arrays.sort(aList);
        Arrays.sort(bList);
        if(aList[0] + bList[0] < answer){
        answer = aList[0] + bList[0];
        }
      	
        System.out.println(answer);   
    }
}