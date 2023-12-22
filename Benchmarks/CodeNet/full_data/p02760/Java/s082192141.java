import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int[][] a = new int [3][3];
      	for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
            	a[i][j] = sc.nextInt();
            }
        }
      	int N = sc.nextInt();
      	int[] b = new int [N];
      	for(int i = 0; i < N; i++){
        	b[i] = sc.nextInt();
        }
      	
      	for(int i = 0; i < N; i++){
        	for(int j = 0; j < 3; j++){
            	for(int k = 0; k < 3; k++){
                	if(b[i] == a[j][k]) a[j][k] = 0;
                }
            }
        }
    	String ans = "No";
      	for(int i = 0; i < 3; i++){
      		if(a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0) ans = "Yes";
      	}
     	for(int i = 0; i < 3; i++){
      		if(a[0][i] == 0 && a[1][i] == 0 && a[2][i] == 0) ans = "Yes";
      	}
      	if(a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) ans = "Yes";
      	if(a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0) ans = "Yes";
      
      	System.out.println(ans);
   }
}