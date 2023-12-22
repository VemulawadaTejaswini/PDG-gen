import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
long N = sc.nextLong();
long M = sc.nextLong();
long div=-1;
for(long i=N;i<=M;i++){
  if(M%i==0){
    div=i;
    break;
  }
}


System.out.println(M/div);
}
}
