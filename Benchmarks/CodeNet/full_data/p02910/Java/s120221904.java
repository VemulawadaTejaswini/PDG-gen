

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String s = sc.next();
      boolean tf = true;
        for(int i = 0;i < s.length() && tf;i++){
           char a = s.charAt(i);
           if(a != 'U' && a != 'D'){
             if((i % 2) == 0){
               if(a != 'R'){
                 tf = false;
               }
             }else{
               if(a != 'L'){
                 tf = false;
               }
             }
           }
        }
      if(tf){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}