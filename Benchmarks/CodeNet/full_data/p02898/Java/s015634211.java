import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] arr = new int[n];
      	for(int i = 0; i < n; i++){
        	arr[i] = sc.nextInt();
        }
      	Arrays.sort(arr);
      	int i;
      	for(i = 0; i < n; i++){
        	if(arr[i] >= k){
            	break;
            }
        }
      	System.out.println(n - i);
    }
}