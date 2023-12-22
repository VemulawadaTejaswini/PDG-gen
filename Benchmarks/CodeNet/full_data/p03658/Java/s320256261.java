import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int k = sc.nextInt();
		int sum=0;
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<n;i++){
			ar.add(sc.nextInt());
        }
		Collections.sort(ar,Collections.reverseOrder());  
		for(int j=0;j<k;j++){
        	sum+=ar.get(j);
        }
		System.out.print(sum);
    }
}