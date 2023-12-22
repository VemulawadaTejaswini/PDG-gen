import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	Integer[] a = new Integer[n];
      	for(int i = 0; i < n; i++)
          a[i] = sc.nextInt();
        Arrays.sort(a, ( new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2)*-1;
                }
        }));
      	int ali, bob;
      	ali = bob = 0;
      	for(int i = 0; i < n; i++)
        	if(i % 2 == 0)
            	ali += a[i];
      		else
              	bob += a[i];
        System.out.println(ali-bob);
    }
}

