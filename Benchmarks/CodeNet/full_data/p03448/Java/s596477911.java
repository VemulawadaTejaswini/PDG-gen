import java.util.*;
public class Main{
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
      
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
   
    int res = 0;
    for(int h=0; h<a; h++){
      for(int i=0;i<b; i++){
        int y = (x-500*h-100*i)/50;
         if(y>=0 && y<=c){
        res++;
        }
    }
    }
      System.out.println(res);
    }
    
}
