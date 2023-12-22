import java.util.*;

class Main{
  private static long answer = 0;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int choice = sc.nextInt();
    
    long[][] info = new long[number][3];
    
    for(int i = 0;i<number;i++){
      for(int j = 0;j<3;j++){
        info[i][j] = sc.nextLong();
      }
    }
    
    comp(info,0,choice,number,0,0,0);
    System.out.println(answer);
  }
  
  public static void comp(long[][] info,int s,int choice,int number,long a,long b,long c){
    if(choice == 0){
      long d = Math.abs(a)+Math.abs(b)+Math.abs(c);
      if(d>answer) answer = d;
    }else{
      for(int i = s;i<number - choice+1;i++){
        long x = a + info[i][0];
        long y = b + info[i][1];
        long z=c + info[i][2];
        comp(info,i+1,choice-1,number,x,y,z);
      }
    }
  }
}