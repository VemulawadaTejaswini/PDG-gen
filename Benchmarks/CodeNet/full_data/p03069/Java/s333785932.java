import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    String s=sc.nextLine();
    char[] c=s.toCharArray();
    int counts1=0;
    int counts2=0;
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
    for(int i=n-1;i>=0;i--){
      if(c[i]=='.'){
        for(int j=i;j>=0;j--){
          if(c[j]=='#'){
            counts2++;
          }
        }
        break;
      }
    }
    System.out.print(Math.max(counts1,counts2));
  }
}