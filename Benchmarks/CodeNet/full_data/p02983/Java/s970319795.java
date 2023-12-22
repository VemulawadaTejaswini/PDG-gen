import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    
    long min = l*r%2019;
    for(long i = l; i <= r; i++){
      for(long j = i+1; j <= r; j++){
      	if(min > (i*j%2019))
          min = i*j%2019;
      }
    }
    System.out.println(min); 
  }
}