import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
      //入力
      String S =sc.next();
      
      //数字列の前半と後半
      String first0 = S.substring(0,2);
      String last0 = S.substring(2,4);
      
      //数字列から数値に変更
      int first = Integer.valueOf(first0);    
      int last = Integer.valueOf(last0);
      
      //前半2桁と後半2桁が月として利用できる
      if((first>0 && first<=12) && (last>0 && last<=12)){
        	System.out.println("AMBIGUOUS");
        }  
        //前半2桁が月として利用できる
        else if(first>0 && first<=12) {
          System.out.println("MMYY");
        }
       //後半2桁が月として利用できる
        else if(last>0 && last<=12){
          System.out.println("YYMM");
        }
      	//どちらも月として利用できない
      	else{
          System.out.println("NA");
        }
    }
}