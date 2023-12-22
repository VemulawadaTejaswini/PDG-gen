import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int cntdig1 = 0;
      int cntdig3=0;
      int cntdig5=0;
      if(a<10){
        cntdig1 += a;
      }else if(a>=10){
        cntdig1=9;
      }
      
      if(10<=a && a<1000){
       cntdig3 += a-99; 
      }else if(a>=1000){
      cntdig3=900;
      }
      
      if(1000<=a && a <100000){
        cntdig5 += a-9999;
      }else if (a>=100000){
        cntdig5=90000;
      }
      if(cntdig1<0){
        cntdig1=0;
      }
      if(cntdig3<0){
        cntdig3=0;
      }
      if(cntdig5<0){
        cntdig5=0;
      }
      int cnt =cntdig1+cntdig3+cntdig5;
		// 出力
		System.out.println(cnt);
	}
}