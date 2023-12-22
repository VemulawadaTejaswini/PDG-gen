import java.util.Scanner;

public class Main {
	static double dis[][];
	static double sum=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[][] = new int[2][n];
		dis = new double[n][n];
		String s="";
		int p = 1;

		for(int i = 0; i < n; i++) {
			d[0][i] = sc.nextInt();
			d[1][i] = sc.nextInt();
			s = s + i;
			p *= i+1;
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {

				dis[i][j] = Math.sqrt(Math.pow(d[0][i] - d[0][j],2) +  Math.pow(d[1][i] - d[1][j], 2));

			}
		}

		permutation(s, "");

        System.out.println(sum/p);

        return;
    }

	public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
        	String end = ans + q;
            for(int j = 0; j < end.length()-1; j++) {
            	sum += dis[end.charAt(j) - '0'][end.charAt(j+1) - '0'];
            }
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}

