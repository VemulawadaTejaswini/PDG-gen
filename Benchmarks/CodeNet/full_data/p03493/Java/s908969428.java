import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int o = 0 ;
    for(int i=1; i <4; i++ ){
        if(a.substring(i) == "1"){
            o++;
        } ;
    }
        System.out.println(o);
    }    
}
