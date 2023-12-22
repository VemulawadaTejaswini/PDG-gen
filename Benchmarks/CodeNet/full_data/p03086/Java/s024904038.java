import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String split[] = s.split("");
		int i;
        int count = 0,ans = 0;
        
      	for(i = 0;i < s.length();i++){
          if(split[i].equals("A") || split[i].equals("C") || split[i].equals("G") || split[i].equals("T") ){
            count += 1;  
          }else{
            if(ans < count){
              ans = count;
            }
            count = 0;
          }
        }
        if(ans < count){
              ans = count;
        }
        System.out.println(ans);   
    }
}