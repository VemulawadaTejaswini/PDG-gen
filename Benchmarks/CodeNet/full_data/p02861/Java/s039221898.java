import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		double sum=0;
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		String s="";
		for(int i=1;i<=n;i++)s+=String.valueOf(i);
		List<String> res=new ArrayList<>();
		res=permutation(s,"",res);
		for(int i=0;i<res.size();i++) {
			for(int j=0;j<n-1;j++) {
				int buff1=Integer.parseInt(res.get(i).toString().substring(j, j+1))-1;
				int buff2=Integer.parseInt(res.get(i).toString().substring(j+1, j+2))-1;
				sum+=Math.sqrt(Math.pow(x[buff1]-x[buff2], 2)+Math.pow(y[buff1]-y[buff2], 2));
			}
		}
		System.out.println(sum/res.size());
	}
	public static List<String> permutation(String q, String ans, List<String> res){
        // Base Case
        if(q.length() <= 1) {
            res.add(ans+q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i), res);
            }
        }
		return res;
    }
}

