import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

    	int a=sc.nextInt();

    	int []A=new int[a];
    	int []color=new int[100001];
    	int ans=1;int flag=-1;
    	for(int i=0;i<a;i++) {
    		A[i]=sc.nextInt();
    		color[A[i]]++;
    		if(map.containsKey(A[i])) {
    			ans++;
    			if(flag!=A[i]&&color[A[i]]>2)ans+=color[A[i]]-2;
    			if(flag==A[i])ans--;
    		}
    		map.put(A[i],i);
    		flag=A[i];
    	}
			System.out.println(ans);
    }
}