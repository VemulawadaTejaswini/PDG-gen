import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] p = new int[m];
		
		int[] count =  new int[n+1];
		String[] index = new String[m];
		String[][] arr = new String[n][m];
		
		for(int i=0; i<m; i++) {
			p[i] = cin.nextInt();
			int t = cin.nextInt();
			cin.nextLine();
			arr[p[i]-1][count[p[i]]] = String.valueOf(i) + "&" + String.valueOf(count[p[i]] + 1) + "&" + String.valueOf(t);
			index[i] = String.valueOf(count[p[i]]+1);
			count[p[i]]++;
		}
		
		for(int i=0; i<n; i++) {
			for(int a=0; a<count[i+1]-1; a++) {	
				for(int b=0; b<count[i+1]-1-a; b++) {
					String[] ta = arr[i][b].split("&");
					String[] tb = arr[i][b+1].split("&");
					if(Integer.valueOf(ta[2]) > Integer.valueOf(tb[2])) {
						arr[i][b] = ta[0] + tb[1] + tb[2];
						arr[i][b+1] = tb[0] + ta[1] + ta[2];
						index[Integer.valueOf(ta[0])] = tb[1];
						index[Integer.valueOf(tb[0])] = ta[1];
					}
				}
			}
		}
		for(int i=0; i<m; i++) {
			System.out.println(String.format("%06d",p[i]) + String.format("%06d",Integer.valueOf(index[i])));
		}
	}
}
