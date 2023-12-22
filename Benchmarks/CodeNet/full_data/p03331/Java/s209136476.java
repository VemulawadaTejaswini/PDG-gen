import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ans = 10000000;
      for(int i=1;i<n;i++){
        int j = n - i;
        int tmp = 0;
        tmp += NumOfDigits(i);
        tmp += NumOfDigits(j);
        if(tmp<ans){
          ans = tmp;
        }
        
      }
      System.out.println(ans);
    }
    public static int NumOfDigits(long num){
    int n = NOfDigits(num);
    int sol = 0;
    for(int i=0;i<n;i++){
      sol += (int)( num / Math.pow(10,n-i-1) );
      num %= (long)Math.pow(10,n-i-1);
    }
    return sol;
  }
  
    public static int NOfDigits(long num){
    int n = 1;
    while(true){
      if( num > Math.pow(10,n) ){
        n++;
      }else{
        break;
      }
    }
    return n;
  }
}