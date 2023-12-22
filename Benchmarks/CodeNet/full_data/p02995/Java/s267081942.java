import java.util.Scanner;

public class Main{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  long A=sc.nextLong();
  long B=sc.nextLong();
  long C=sc.nextLong();
  long D=sc.nextLong();
  long answer=0;

  for(long n=A;A<=B;n++){
    if(n%C!=0 && n%D!=0){
      answer+=1;
    }
  }

System.out.println(answer);

  }
}
