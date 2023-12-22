import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
	  String S = sc.next();
      String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R",
           "S","T","U","V","W","X","Y","Z"};
      String kitta = "";
      int Sl=S.length();
      for(int i=0;i<Sl;i++){
        kitta=S.substring(i,i+1);
        for(int j=0;j<26;j++){
          if(kitta.equals(al[j])){
            System.out.print(al[(j+N)%26]);
          }
        }
      }

        
      

 
      
    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}