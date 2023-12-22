import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    int y = sc.nextInt(); 
if(x>=y){
 int k = x - y;
  if((y-k)%3!=0) System.out.println(0);
  else{
  int t = (y - k)/3;
    
  System.out.println(calcNumOfCombination(2*t+3*k, t+k));
   
  }
}
   else{
 int k = y - x;
  if((x-k)%3!=0) System.out.println(0);
  else{
  int t = (x - k)/3;
    
  System.out.println(calcNumOfCombination(2*t+3*k, t+k));
   
  }
}

 }
   static  long calcNumOfCombination(int n, int r){
        long num = 1;
        for(int i = 1; i <= r; i++){
            num = (num * (n - i + 1) / i)%1000000007;
        }
        return num;
    }
}