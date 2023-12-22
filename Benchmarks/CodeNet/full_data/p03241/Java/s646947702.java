import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int M = sc.nextInt();
int div=-1;
for(int i=N;i<=M;i++){
  if(M%i==0){
    div=i;
    break;
  }
}


System.out.println(M/div);
}
}
