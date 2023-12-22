import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    /*
    a = 0
    b = 1
    c = 2
    */
    
    String str[] = new String[3];
    int count[] = new int[3];
    for(int i = 0 ; i < 3 ; ++i){
      str[i] = sc.next();
      count[i] = str[i].length();
    }
	
    //最初はAさん
    int i = 0;
    
    while(true){    
  
      //あがりの人いるかな
      if(count[i]==0){
        if(i==0){
          System.out.println("A");
        }else if(i==1){
          System.out.println("B");
        }else if(i==2){
          System.out.println("C");
        }
        return;
      }
     
      //次の人誰かな
      if(str[i].charAt(str[i].length()-count[i])=='a'){
        i=0;
      }else if(str[i].charAt(str[i].length()-count[i])=='b'){
        i=1;
      }else if(str[i].charAt(str[i].length()-count[i])=='c'){
        i=2;
      }
      
      //カードぽいっ
      count[i]--;
 
    }

  }
}