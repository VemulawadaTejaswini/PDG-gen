import java.util.*;
public class Main{
  	public static void main (String [] args){
      	Scanner scanner = new Scanner (System.in);
      	int N = scanner.nextInt();
      	int [] arr = new int [N];
      	for (int i = 0; i < N; i++){
          	arr[i] = scanner.nextInt();
        }
      	Arrays.sort(arr);
      	int half = (arr[N-1])/2;
      	int sum = 0;
      	for (int i = 0; i < N-1; i++){
          	sum += arr[i];
        }
      	sum += half;
      	System.out.println(sum);
    }
}