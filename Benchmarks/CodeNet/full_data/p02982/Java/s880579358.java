mport java.util.Scanner;
public class Main {
	public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);

        int n1 = stdin.nextInt();
        int n2 = stdin.nextInt();
        //System.out.println(n1);
        //System.out.println(n2);
        //System.out.println("b");
        int [][] input = new int [n1+1][n2+1];

        for(int i = 0; i < n1; i++) {
        	for(int j = 0; j < n2; j++) {
        		//System.out.println(stdin.nextInt());
        		input[n1][n2] = stdin.nextInt();
        	}
        }
        //System.out.println("a");
        stdin.close();

        int dis = 0;
        double tmp = 0;
        int output=0;
        for(int i = 0; i < n1; i++) {
        	for(int j = 0; j < n2; j++) {
        		for(int k = 1; k < n1; k++) {
        		tmp = tmp + Math.pow(input[i][j]-input[i+k][j], 2);
        		}
        	}
        	dis = (int) Math.pow(Math.sqrt(tmp),2);
        	if(dis == tmp) {
        		output++;
        	}
        }

        System.out.println(output);






	}
}
