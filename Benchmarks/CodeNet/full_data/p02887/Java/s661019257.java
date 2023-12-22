import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    String sli=scan.next();
    int Ans=1;
    for(int a=1; a<num; a++){
      if(!(String.valueOf(sli.charAt(a)).equals(String.valueOf(sli.charAt(a-1))))){
        Ans++;
      }
    }
    System.out.println(Ans);
  }
}