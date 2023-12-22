import java.util.Scanner;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            String n1 = sc.next();
            String n2 = sc.next();
            String n3 = sc.next();

            // 出力
            System.out.println(n1.substring(0,1) + n2.substring(1,2) + n3.substring(2,3));
            
            sc.close();
        }
    }
	