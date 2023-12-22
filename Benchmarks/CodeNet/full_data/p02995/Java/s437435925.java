import java.util.Scanner;

public class Main{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  long A=sc.nextLong();
  long B=sc.nextLong();
  int C=sc.nextInt();
  int D=sc.nextInt();
  long answer=0;

  for(int n=A;A<=B;n++){
    if(n%C!=0 && n%D!=0){
      answer+=1;
    }
  }

System.out.println(answer);

  }
}
