import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int[] array = new int[m*2];
        List<Integer> card = new ArrayList<Integer>();
        Set<List<Integer>> card2 = new HashSet<List<Integer>>(); 
        int[] cardNum = new int[n];
        int count = 0;
        for(int i=0; i<m; i++){
          l[i] = sc.nextInt();
          r[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
          array[i] = l[i];
          array[m+i] = r[i];
        }
        if(array[m]-array[m-1] < 0) System.out.println(array[m-1]-array[m]+1);
        else System.out.println(array[m]-array[m-1]+1);
	}
}