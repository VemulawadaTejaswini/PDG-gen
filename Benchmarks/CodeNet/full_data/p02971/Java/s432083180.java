import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int max = 0;
      	int sec = 0;
      	int N = sc.nextInt();
      	int[] A = new int[N];
      	for(int i = 0;i < N;i++){
          	A[i] = sc.nextInt();
          	//初期値設定
          	if(i == 0) {
          		max = A[i];
          		sec = A[i];
          	}
          	//値更新
          	if(A[i] > max){
              	max = A[i];
            }else if(A[i] <= max && A[i] > sec){
              	sec = A[i];
            }
        }
      	sc.close();
      	for(int i = 0;i < N;i++){
        	System.out.println(A[i]==max ? sec : max);
        }
	}
}