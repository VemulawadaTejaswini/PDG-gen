import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int m = scn.nextInt();
		int[] p = new int[m];
      	String s = new String[m];
		for(int i=0; i<p.length; i++){
			p[i] = scn.nextInt();
          	s[i] = scn.next();
		}
      	int[] a = new int[n];
      	for(int i=0; i<=n; i++){
          a[i]=0;
        }
      	int count = 0;
      	for(int i=1; i<=n; i++){
          for(int j=0; j<p.length; j++){
            if(i==p[j] && s[j].equals("WA")) a[i]++;
            if(i==p[j] && s[j].equals("AC")){
              count++;
              break;
            }
          }
        }
      	int sum = 0;
      	for(int i=1; i<=n; i++){
          sum += a[i];
        }
      	System.out.println(count);
      	System.out.println(sum);
	}
}
