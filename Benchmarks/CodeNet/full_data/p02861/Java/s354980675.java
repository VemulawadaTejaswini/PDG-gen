import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int town[][] = new int[n][2];
      	double ave = 0;
      	for(int i = 0; i < n; i++){
        	town[i][0] = Integer.parseInt(sc.next());
          	town[i][1] = Integer.parseInt(sc.next());
        }

      
      	int x, y;
      	for(int i = 0; i < n; i++){
        	for(int j = i + 1; j < n; j++){
              	x = Math.abs(town[i][0] - town[j][0]);
              	y = Math.abs(town[i][1] - town[j][1]);
            	ave += Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            }
        }
        ave *= 2;
      	
     	System.out.println(ave/n);
      	
      
      
	}
}