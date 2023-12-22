import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(a + b < c){
      System.out.println(0 + " " + 0); 
      System.exit(0);
    }    
    long ch = c / 2;
    long bans = b - ch;
    long atmp = 0;
    long btmp = 0;
    if(bans < 0){
      btmp = Math.abs(bans); 
      bans = 0;
    }
    long ah = c -ch + btmp;
    long aans = a - ah;
    if(aans < 0){
      atmp = Math.abs(aans); 
      aans = 0;
    }
    bans -= atmp;

    System.out.println(aans + " " + bans);
  }
}
