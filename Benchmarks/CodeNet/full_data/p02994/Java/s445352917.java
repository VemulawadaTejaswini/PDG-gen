import java.util.*;
public class Main{
	public static void main(String[] args){
		int sum = 0;
		int all = 0;
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int l = sc.nextInt();
      	int[] array = new int[n];
      	int[] array2 = new int[n];
      	for(int i = 0;i < n;i++){
      		array[i] = l+i;
          	array2[i] = Math.abs(array[i]);
      	}
      	sum = array2[0];
      	for(int j = 0;j < n;j++){
      		sum = Math.min(sum, array2[j]);
      		if(sum == array2[j]) {all = array[j];}
        }
      	System.out.println((n*(l*2+n-1))/2-all);
      	sc.close();
    }
}