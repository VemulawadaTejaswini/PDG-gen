import java.util.Scanner;
public class Main{
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
      
      int ans = 0;
      
      for(int i = x;i>=0;i++)
      {
        for(int j =1;j<=350;j++)
        {
          if(j==350)
            ans = i;
          
          if(i%j==0)
            break;
        }
        
        if(ans!=0)
          break;
      }
      

      

      
 
 
 
      
      
 
 
 
		
		
	}
 
}