import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n =Long.parseLong(sc.nextLine());
    String s=sc.nextLine();
    char[] c=s.toCharArray();
    long counts1=0;
    for(int i=0;i<n;i++){
      if(c[i]=='#'){
        for(int j=i;j<n;j++){
          if(c[j]=='.'){
            counts1++;
          }
        }
        break;
      }
    }
    System.out.print(counts1);
  }
}