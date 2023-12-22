import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),flagp=0,flagq=0;
		String p="",q="";
		for(int i=0;i<n;i++)p+=String.valueOf(sc.nextInt());
		for(int i=0;i<n;i++)q+=String.valueOf(sc.nextInt());

		String s="";
		for(int i=1;i<=n;i++) {
			s+=String.valueOf(i);
		}
		List<String> res=new ArrayList<String>();
		permutation(s,"",res);
		for(int i=0;i<res.size();i++) {
			if(p.equals(res.get(i)))flagp=i;
			if(q.equals(res.get(i)))flagq=i;
		}
		System.out.println(Math.abs(flagp-flagq));
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

