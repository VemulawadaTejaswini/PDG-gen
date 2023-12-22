import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
        String s[] = a.split("");
        String str[] = new String[a.length()];
        int i,count = 0;
        int check = 0,check2 = 0;
        String ans = "";
		if(a.equals("keyence")){
          System.out.println("YES");
          System.exit(0);
        }
        
        
        for(i = 0;i < a.length();i++){
			if(count == 0 && s[i].equals("k")){
              count += 1;
              ans += s[i];
              check = 0;
            }else if(count == 1 && s[i].equals("e")){
              count += 1;
              ans += s[i];
              check = 0;
            }else if(count == 2 && s[i].equals("y")){
              count += 1;
              ans += s[i];
              check = 0;
            }else if(count == 3 && s[i].equals("e")){
              count += 1;
              ans += s[i];
              check = 0;
            }else if(count == 4 && s[i].equals("n")){
              count += 1;
              ans += s[i];
              check = 0;
            }else if(count == 5 && s[i].equals("c")){
              count += 1;
              ans += s[i];
              check = 0;
            }else if(count == 6 && s[i].equals("e")){
              count += 1;
              ans += s[i];
              check = 0;
            }else{
              if(check < check2){
         		 System.out.println("NO");
            	 System.exit(0);
              }              
              check += 1;
			  check2 = check;
              
            }
          
        }
      
        if(ans.equals("keyence")){
          System.out.println("YES");
          System.exit(0);
        }
        System.out.println("NO");

    }
}