import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char[] str = sc.nextLine().toCharArray();
    long counter = sc.nextLong();
    
    int i = 0;
    while(str[i] == '1' && ++i<str.length);
    
    if(i>=counter) System.out.println(1);
    else System.out.println(str[i]);
  }
}