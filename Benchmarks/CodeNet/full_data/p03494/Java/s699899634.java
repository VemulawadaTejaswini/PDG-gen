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
      　boolean bool = false;
      	while(true){
          for(int an: a){
              if(an % 2 != 0){
                  bool = true;
              }
          }
          if(bool){break;}
          count++;
        }
      	System.out.println(count);
    }
}
