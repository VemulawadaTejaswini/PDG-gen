    import java.util.Scanner;
            import java.util.ArrayList;
            import java.util.Collections;
        	import java.util.Arrays;
             
            public class Main { //クラス名はMain
                public static void main(String[] args) {
                    //コード
                  Scanner sc = new Scanner(System.in);
                  int mojilen = Integer.parseInt(sc.nextLine());
                  int seigen = 0;
                  String c2 = sc.nextLine();
        		  String[] strArray1 = c2.split(" ");
                  //文字列リテラル　→　整数変換
                  int[] x = new int[strArray1.length];
            		for (int i = 0; i < strArray1.length; i++) {
                	x[i] = Integer.parseInt(strArray1[i]);
            		}
                  //偶数奇数判定
                  if (Math.abs(mojilen) % 2 == 0) {
                //偶数
                seigen = (mojilen / 2);
              }
                else {
                //奇数
                  seigen = (int)(mojilen / 2);
                  seigen++;
              }
                  int a = 0;
                  int b = 0;
                  int cost = 0;
                  //判定
                  for(int k=0;k<seigen;k++) {
                    	a = a + x[k];
                  }
                  for(int k=seigen;k<mojilen;k++) {
                    	b = b + x[k];
                  }
                  cost = Math.abs(b - a);
                  System.out.println(cost);
}
}