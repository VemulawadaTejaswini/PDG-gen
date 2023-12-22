import java.util.* ; 
import java.math.*;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
    String s = scan.next();
    char[] ch = s.toCharArray();
    int x = 0 ;
    int max = 0;
    for(int i = 0 ; i <n ; i++){
      if(ch[i] == 'I'){
        x++;
        if(x>max){
          max = x ;
        }
      }else if(ch[i] == 'D'){
        x-- ;
      }
    }
    System.out.println(max);
  }
}