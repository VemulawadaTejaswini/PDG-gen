import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int pt1 = p+q;
    int pt2 = p+r;
    int pt3 = r+q;
    if(pt1<=pt2){
      if(pt1<=pt3){
        System.out.println(pt1);
      }else{
        System.out.println(pt3);
      }
    }else{
      if(pt2<=pt3){
        System.out.println(pt2);
      }else{
        System.out.println(pt3);
      }
    }  
  }
}