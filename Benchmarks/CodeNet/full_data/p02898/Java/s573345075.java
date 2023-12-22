import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
          String n1 = sc.nextLine();
          String[] strArray1 = n1.split(" ");
          String word = sc.nextLine();
          String[] strArray2 = word.split(" ");
          //値の代入
          int seigen = Integer.parseInt(strArray1[1]);
          int count = 0;
          for(int i=0;i<Integer.parseInt(strArray1[0]);i++) {
            if (Integer.parseInt(strArray2[i]) >=  seigen){
       			count++;
      			}
      		else{
        		// 処理なし
      			}
          }
          System.out.println(count);
    }
    }