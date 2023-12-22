import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int H,W,h,w,all_cell,a,b;

    H=sc.nextInt();
    W=sc.nextInt();

    h=sc.nextInt();
    w=sc.nextInt();

    all_cell=H*W;
    a=W*h;
    b=H*w-h;


    if(H==h||W==w){
      System.out.println(0);
    }else{
      System.out.println(all_cell-a-b);
    }


  }
}
