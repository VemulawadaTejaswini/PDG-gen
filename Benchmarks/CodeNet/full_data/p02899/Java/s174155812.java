import java.util.*;
public class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	ArrayList<Integer> intList = new ArrayList<Integer>();
      	for(int i = 0; i<N;i++){
        	intList.add(sc.nextInt());
        }
      	ArrayList<Integer> getAt = new ArrayList<Integer>();
        for(int j = 1;j<=N;j++){
        	System.out.print((intList.indexOf(j)+1) + " ");
        }
    }
}