import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int k = scan.nextInt();
    long k_lnln = 0;
    int lnln_counter = 0;
    
    for(long i = 1;lnln_counter != k;i++){
      if(isLnln(i)) lnln_counter++;
      if(lnln_counter == k){
        k_lnln = i;
        break;
      }
    }
      
    System.out.println(k_lnln);
  }
  
  static boolean isLnln(long l){
    String l_String = Long.toString(l);
    int chars = l_String.length();
    int[] num = new int[chars];
    num[0] = l_String.charAt(0);
    for(int i = 1;i < chars;i++){
      num[i] = l_String.charAt(i);
      if(Math.abs(num[i] - num[i-1]) > 1) return false;
    }
    return true;
  }
}