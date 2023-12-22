import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int a[][] = new int[3][3];
      	for(int i = 0; i < 3; i++)
          for(int j = 0; j < 3; j++)
            a[i][j] = sc.nextInt();
      
      	boolean flag = true;
      	for(int i = 0; i < 2; i++){
      		if((a[0][i] - a[0][i+1] != a[1][i] - a[1][i+1] || a[1][i] - a[1][i+1] != a[2][i] -a[2][i+1])) 
              flag = false;
    	}
      	for(int i = 0; i < 2; i++){
      		if((a[i][0] - a[i+1][0] != a[i][1] - a[i+1][1] || a[i][1] - a[i+1][1] != a[i][2] -a[i+1][2])) 
              flag = false;
    	}
      
      	if(flag)
          System.out.println("Yes");
      	else
          System.out.println("No");
    }
  
}