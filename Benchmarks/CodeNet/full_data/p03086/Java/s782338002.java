import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String str = sc.next();
   int count = 0;
   int countmem = 0;
 for (int i = 0; i < str.length(); i++) {
	if(str.charAt(i) == 'A' || str.charAt(i) == 'T' ||
       str.charAt(i) == 'C' || str.charAt(i) == 'G'){
       count++;
    }else{
      if(countmem < count){
      countmem = count;
      }
      count = 0;
    }
   if(i == str.length()-1 && countmem < count){
      countmem = count;      
   }
  }
    System.out.print(countmem);
 }
}