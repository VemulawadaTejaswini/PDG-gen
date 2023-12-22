import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] ABC=new int[3];
    for(int i=0;i<3;i++){
      ABC[i]=sc.nextInt();
    }
    Arrays.sort(ABC);
    boolean flg=false;
    if(ABC[0]==5){
      if(ABC[1]==5){
        if(ABC[2]==7){
          flg=true;
        }
      }
    }
    if(flg){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}