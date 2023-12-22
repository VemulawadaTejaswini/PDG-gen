import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<String> z;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[][] arr = new int[N][2];
		z = new ArrayList<>();
		String defaultNum="";
		for(int i=0;i<N;i++){
			arr[i][0] =Integer.parseInt(sc.next()); 
			arr[i][1] =Integer.parseInt(sc.next()); 
			defaultNum += i+1;
		}
		permutation(defaultNum, "");
		List<Double> totalList = new ArrayList<>();
		for(String aa : z){
			double distance = 0;
			for(int i=0;i<aa.length()-1;i++){
				int start = Integer.parseInt(aa.substring(i,i+1))-1;
				int goal = Integer.parseInt(aa.substring(i+1,i+2))-1;
				distance += Math.sqrt(Math.pow(arr[start][0]-arr[goal][0], 2) + Math.pow(arr[start][1]-arr[goal][1], 2));
			}
			totalList.add(distance);
		}
		double total = 0;
		for(Double a:totalList) total+=a;
		System.out.println(total/totalList.size());
	}

	private static void permutation(String q, String ans){
		if(q.length() <=1){
			z.add(ans+q);
		} else {
			for(int i=0;i<q.length();i++){
				permutation(q.substring(0,i) + q.substring(i+ 1), ans+ q.charAt(i));
			}
		}
	}
}
