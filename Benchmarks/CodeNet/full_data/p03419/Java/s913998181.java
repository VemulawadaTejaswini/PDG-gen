import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h=sc.nextLong(),w=sc.nextLong();
    if(h==2 || w==2) {
    	System.out.println(0);
    }else {
    	System.out.println(Math.max(h-2,1)*Math.max(w-2, 1));
    }
  }
}
