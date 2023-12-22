    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int c=Integer.parseInt(scan.next());
    		int[] array= {a,b,c};
    		Arrays.parallelSort(array);
    		System.out.print(array[2]*10+array[1]+array[0]);
     
    }
    }
// end 