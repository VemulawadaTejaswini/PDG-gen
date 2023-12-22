import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean flag = false;

    for(int i = 1; i <= b; i++){
      if(a * i % b == c){
        flag = true;
        break;
      }
    }

    if(flag == true){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
