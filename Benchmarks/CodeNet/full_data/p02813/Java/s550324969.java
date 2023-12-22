import java.util.Scanner;
public class Main {
  
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int length = Integer.parseInt(scan.nextLine());
    String strA = scan.nextLine();
    String strB = scan.nextLine();
    
    int cntA = count(strA, length);
    int cntB = count(strB, length);

    if ((cntA - cntB) >= 0) {
    System.out.println(cntA - cntB);
  } else {
       System.out.println(cntB - cntA);
    }
  }
  
  private int count(String str, int length) {
    
    // strの各数列をリストに突っ込む
    List<Integer> strList = new ArrayList<Integer>(); 
    for (i = 0; i < str.length(); i++) {
      int num = Integer.parseInt(str.substring(i + i, i + 2));
      strList.add(num);
    }
	int cnt = 0;
    //N!÷lengthの大きさが1番左の数字の個数
    // 1版左の数について、その前までの個数
    cnt = cnt + (strList.get(0) - 1) * kaijo(length) / length;
    //  2番目以降の数について、その前までの個数
    // その数が左の数より大きい場合
    for (j = 0; j < strList.size() -1; j++){
		if (strList.get(1) > strList.get(0) {
		   cnt = cnt + (strList.get(1) - 1 - 1) * kaijo(length -1)/(length -1);
	    } else if (strList.get(1) = 1 ){
 	     //左の数より小さい場合、その数-1 * 数字の個数（1の場合は1）
  		   cnt = cnt + strList.get(1) -1;
	    } else {
	       cnt = cnt + (strList.get(1) -1) * kaijo(length -1)/(length -1);
 	   }
    }
        return cnt;    
  }
  // 階乗の計算
  private int kaijo(int n) {
      for(int i = 1; i <= n; i++)  {
        fact = fact * i;
      }
    return fact;
  }
}