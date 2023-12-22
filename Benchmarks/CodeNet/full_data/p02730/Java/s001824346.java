import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] kaibun = S.toCharArray();
        int N = kaibun.length;
        char[] reverse = new char[N];
        String ans = "No";
      
        for(int i = 0 ;i < N; i++){
          reverse[i] = kaibun[N-1-i];
          if(reverse[i] == kaibun[i]){
            ans = "Yes";
          }else{
            ans = "No";
          }
        }
      
        char[] kaibun1 = new char[(N-1)/2];
        for(int i = 0 ;i < (N-1)/2; i++){
          kaibun1[i] = kaibun[i];
        }
        String str1 = new String(kaibun1);
        char[] kaibun2 = new char[(N-1)/2];
        for(int i = 0 ;i < (N-1)/2; i++){
          kaibun2[i] = reverse[i];
        }
        String str2 = new String(kaibun2);
      
       StringBuilder sb1 = new StringBuilder(str1);
       StringBuilder sb2 = new StringBuilder(str2);
       if(str1.equals(sb1.reverse().toString())){
         ans = "Yes";
       }else{
         ans = "No";
       }
       if(str2.equals(sb2.reverse().toString())){
         ans = "Yes";
       }else{
         ans = "No";
       }
       
        
      System.out.println(ans);
      
	}

}