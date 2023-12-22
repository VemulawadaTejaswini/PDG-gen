import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
      int check=2*n;
      boolean a=false;
      int num=0;
      int index=0;
      for(int i=0;num<check;i++){
      	num=i*(i+1);
        index=i;
      }
      if(num==check){
        a=true;
      }
      if(a){
      	System.out.println("Yes");
        /*System.out.println(index+1);
        for(int i=0;i<index+1;i++){
        	System.out.print(index+1);
        }*/
      }
      else System.out.println("No");
    }
}