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
      	  boolean bool = false;
          for(int an: a){
              if(an % 2 != 0){
                  bool = true;
              }
          }
          if(bool){break;}
      	  for(int i=0; i<n; i++){
          	a[i] /= 2;
      	  }
          count++;
        }
      	System.out.println(count);
    }
}
