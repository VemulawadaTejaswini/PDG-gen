import java.util.*;
public class Main{
  	public static void main (String [] args){
      	Scanner SC = new Scanner (System.in);
      	int N = SC.nextInt();
      	int [] array = new int [N];
      	for (int i = 0; i < N; i++){
          	array[i] = SC.nextInt();
        }
      	Arrays.sort(array);
      	int half = (array[N-1])/2;
      	int sum = 0;
      	for (int i = 0; i < N-1; i++){
          	sum += array[i];
        }
      	sum += half;
      	System.out.println(sum);
    }
}