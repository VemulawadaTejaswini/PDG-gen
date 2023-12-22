import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int z = Integer.parseInt(sc.next());
            
            //出力
            if(x+y<z){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
            sc.close();
        }
    }
	