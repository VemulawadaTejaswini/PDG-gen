import java.util.Scanner;
public class Main{
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      	int k = sc.nextInt();
      
      	int s = sc.nextInt();
      	int p = sc.nextInt();
      	int r = sc.nextInt();
      
      String jan = sc.next();
      int[] check = new int[100000];
      
      int sum = 0;
      
      for(int i = 0;i<n;i++){
        if(i>=k)
        {
          if(jan.charAt(i)==jan.charAt(i-k)&&check[i-k]!=2){
            check[i]=2;
            continue;
          }
        }
        
        if(jan.charAt(i)=='p')
          sum+=p;
        else if(jan.charAt(i)=='r')
          sum+=r;
        else
          sum+=s;
        
      }
      

      System.out.println(sum);
 

 
      
 
 
 
      
      
 
 
 
		
		
	}
 
}