/*
 * 文字列 S が与えられます。
 * 
 * 高橋君はこの文字列の好きな位置に好きなだけ文字 A を挿入することができます。
 * 
 * S を AKIHABARA に変えることはできるでしょうか？
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            String s = sc.next();
            
            // 先頭がAなら省く
            if(s.charAt(0) == 'A'){
            	s = s.substring(1);
            }
            
            // 先頭がKIHならOK
            if(s.length() > 4 && s.substring(0, 3).equals("KIH")){
           		s = s.substring(3);
           		// 先頭がAなら省く
           		if(s.charAt(0) == 'A'){
           			s = s.substring(1);
           		}
           		
           		// 先頭がBならOK
            	if(s.charAt(0) == 'B'){
            		s = s.substring(1);
            		// 先頭がAなら省く
            		if(s.charAt(0) == 'A'){
               			s = s.substring(1);
               		}
            		
            		// 残りがRまたはRAならOK
            		if(s.equals("R") || s.equals("RA")){
            			System.out.println("YES");
            			sc.close();
            			return;
                	}
            	}
            }
            // どこかしらで脱落したらNOを出力
            System.out.println("NO");
            sc.close();
        }
    }
	