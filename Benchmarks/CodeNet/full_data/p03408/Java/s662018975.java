import java.util.*;
public class Main {
		 
			public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[]    Rcount = new int[100];
				int sum=0;
				String[] b = new String[n];
				for(int i=0; i<n; i++) {
					b[i]= sc.next();
				}
				int m = sc.nextInt();
				String[] r = new String[m];
				for(int j=0; j<m;j++) {
					r[j]=sc.next();
				}
				for(int i = 0; i < 100; i++){
			          Rcount[i] = 0;
			          }
			      for(int i = 0; i < n; i++){
			          for(int j = 0; j < n; j++){
			              if(b[i].equals(b[j])){
			                 Rcount[i]++;
			                 System.out.println(b[i] + "+1" + b[j]);
			                 }
			              }
			          for(int k = 0; k < m; k++){
			              if(b[i].equals(r[k])){
			                 System.out.println(b[i] + "-1" + r[k]);
			                 Rcount[i]--;
			                 }
			              }
			          }
			      Arrays.sort(Rcount);
			      for(int i = 0; i < 100; i++){
			          System.out.println(Rcount[i]);
			          }
			}
		 
		}
