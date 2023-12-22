import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int tmp = 1;

    for(int i = 0; i < n; i++){
      if(tmp*2 > tmp + k){
        tmp += k;
      }else{
        tmp *= 2;
      }
    }

    System.out.println(tmp);
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
