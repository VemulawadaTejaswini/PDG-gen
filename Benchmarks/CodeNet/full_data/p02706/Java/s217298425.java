import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m = sc.nextInt();
    int a=0;
    for(int i=0;i<m;i++){
    	a+=sc.nextInt();
    }
    n-=a;
    if(n<0){
    	pl("-1");
    }else{
    	pl(n+"");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
