import java.util.*;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		String a[];
		String b[];
		int count=0;
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}

		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				a=s[i].split("");
				b=s[j].split("");
				Arrays.sort(a);
				Arrays.sort(b);
				if(Arrays.equals(a,b)){
					count++;
				}
			}
		}

		System.out.println(count);




	}
}
