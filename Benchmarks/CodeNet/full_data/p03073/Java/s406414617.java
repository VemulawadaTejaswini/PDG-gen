import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int result = 0;
        int a1=0;//奇数番目の1の数
        int b1=0;//偶数番目の1の数
        int a0=0;//奇数番目の0の数
        int b0=0;//偶数番目の0の数
      
        for(int i=0;i<s.length();i++){
          if(i%2==0){
            if(s.charAt(i)=='0'){
              a0++;
            }else{
              a1++;
            }
          }else{
            if(s.charAt(i)=='0'){
              b0++;
            }else{
              b1++;
            }
          }
        }
      //奇数番目を0にする場合
      result = a1+b0;
      //偶数番目を0にする場合
      if(b1+a0 < result)result = b1+a0;
      System.out.println(result);
	}
}