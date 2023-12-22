import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int fcount = 0;
    int scount = 0;
    for(int i = 0;i < 3;i++){
      int a = stdIn.nextInt();
      if(a == 5)
        fcount++;
      else if(a == 7)
        scount++;
    }
    if(fcount == 2 && scount == 1)
      System.out.println("YES");
    else
      System.out.println("NO");
      