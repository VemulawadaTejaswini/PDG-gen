import java.util.Scanner;
         
        public class Main { //クラス名はMain
            public static void main(String[] args) {
                //コード
              Scanner sc = new Scanner(System.in);
              int n1 = sc.nextInt();
              String wordw = sc.nextLine();
              int cut1 = n1 / 2;
              String word = sc.nextLine();
              String wordc1 = word.substring(0, cut1);
              String wordc2 = word.substring(cut1, n1);
              
              //処理打ち切り
              if (n1 <= 1) {
            System.out.println("No");
            return;
          } 
              //判定
              if (wordc1.equals(wordc2)) {
                	//等しいとき
                System.out.println("Yes");
           	}
          	else {
              		//等しくないとき
            		System.out.println("No");;
         		}
          }
        }