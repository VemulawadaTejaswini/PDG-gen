import java.util.Scanner;
public class Main{
  
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    String str1 = scan.next();
    String str2 = scan.next();

 	int d = Integer.parseInt(str1);
    int n = Integer.parseInt(str2);
    
    if(d == 0){
     System.out.println(n);
     return;
    }
    
	//100でd回割り切れる場合のn番目に小さい数字
    int result = 0, count = 0;
    for(int i = 1 ; i <= Integer.MAX_VALUE ; i++){
      	if((i % (int)Math.pow(100,d))==0
          && (i >= (int)Math.pow(100,d))){
		  //System.out.println(i);
          count++;
        }
        
      if(count == n){
          result = i;
          break;
        }
    }
    System.out.println(result);
    }
}