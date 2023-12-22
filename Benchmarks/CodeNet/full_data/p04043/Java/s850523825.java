import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int argInt[] ={a,b,c};
     
      int fiveCount = 0;
      int sevenCount = 0;
       
      for(int arg: argInt){
      	if(arg == 5){
          fiveCount++;
        }
        if( arg == 7){
          sevenCount++;
        }
      }
      
      if(fiveCount == 2 || sevenCount == 1){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    }
}