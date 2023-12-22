import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a,b,c ;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      
      if(a==5 && b ==5 && c==7){
      	System.out.println("YES");
      }else if(a==5 && b ==7 && c==5){
        System.out.println("YES");
      }else if(a==7 && b ==5 && c==5){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
	}
}