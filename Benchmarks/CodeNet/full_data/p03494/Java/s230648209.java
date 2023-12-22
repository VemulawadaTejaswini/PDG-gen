import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	for(int i=0; i<n; i++){
        	a[i] = scan.nextInt();
        }
      	int count = 0;
      	while(true){
          int countN = 0;
          for(int an: a){
              if(a[n]%2 == 0){
                  countN++;
              }
          }
          if(countN != n){break;}
          count++;
        }
      	System.out.println(count);
    }
}
