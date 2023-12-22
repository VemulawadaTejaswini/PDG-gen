      import java.util.Scanner;
         
        public class Main { //クラス名はMain
            public static void main(String[] args) {
                //コード
              Scanner sc = new Scanner(System.in);
        	  String n = sc.nextLine();
              String[] strArray = n.split(" ");
              int a = Integer.parseInt(strArray[0]);
              int b = Integer.parseInt(strArray[1]);
              int c = Integer.parseInt(strArray[2]);
              
              int wa = a + b + c;
              
              //判定
              if (wa >= 22) {
                System.out.println("bust");
              }else{
                 System.out.println("win"); 
              }
            }
        }