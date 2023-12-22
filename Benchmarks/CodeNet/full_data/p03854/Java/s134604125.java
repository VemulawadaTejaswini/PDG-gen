import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    while(s!=null){
      if(s.length()<5){
        System.out.println("NO");
        return;
      }
      if(s.length()==5){
        if(s.equals("dream")){
          s=null;
        }else if(s.equals("erase")){
            s=null;
        }else{    
          System.out.println("NO");
          return;
        }
      }else if(s.length()==6){
        if(s.equals("eraser")){
          s=null;
        }
      }else if(s.length()==7){
        if(s.equals("dreamer")){
          s=null;
        }
      }else if(s.substring(5,6).equals("r")){//eraserの判定。
        if(s.substring(0,6).equals("eraser")){
          s=s.substring(6,s.length());
        }else{
          System.out.println("NO");
          return;
        }
      }else if(s.substring(0,1).equals("e")){//eraseの判定
        if(s.substring(0,5).equals("erase")){
          s=s.substring(5,s.length());
        }else{
          System.out.println("NO");
          return;
        }
      }else if(s.substring(8,9).equals("r")){//dreamerの判定
        if(s.substring(0,7).equals("dreamer")){
          s=s.substring(7,s.length());
        }else{
          System.out.println("NO");
          return;
        }
      }else{
        if(s.substring(0,5).equals("dream")){
          s=s.substring(5,s.length());
        }else{
          System.out.println("NO");
          return;
        }
      }
    }
    System.out.println("YES");
  }
}