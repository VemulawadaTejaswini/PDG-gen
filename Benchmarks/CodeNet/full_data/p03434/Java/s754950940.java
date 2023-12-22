import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	for(int i = 0; i < n; i++)
          a[i] = sc.nextInt();
      	Arrays.sort(a);
      	int ali, bob;
      	ali = bob = 0;
      	for(int i = 0; i < n; i++)
        	if(i % 2 == 0)
            	ali += a[i];
      		else
              	bob += a[i];
        if(ali > bob)
            System.out.println(ali-bob);
        else
            System.out.println(bob-ali);
    }
}

