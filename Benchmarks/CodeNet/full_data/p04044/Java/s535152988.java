import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int L=sc.nextInt();
    String[] s= new String[N];
    for(int i=0;i<N;i++) {
      String demostring=sc.next();
      if(demostring.length()==L) {
        s[i]=demostring;
      } else {
        System.out.println("string is not same length");
      }
    }

    Arrays.sort(s);
    for(int j=0;j<N;j++) {
      System.out.print(s[j]);
    }


}
}
