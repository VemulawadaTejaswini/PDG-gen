import java.util.*;

class Main {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int count = 0;
     int tmp = 0;
     for(int i = 0; i < b-a+1; i++){
         tmp = a + i;
         if(tmp == flipNum(tmp)){
             count++;
         }
     }
     System.out.print(count);
 }
 
 private static int flipNum(int tmp){
     String tmpStr = String.valueOf(tmp);
     StringBuilder sb = new StringBuilder(tmpStr).reverse();
     String flipTmpStr = sb.toString();
     int flipTmp = Integer.parseInt(flipTmpStr);
     return flipTmp;
 }
}