import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b=0;
    int r=0;
    String s=sc.next();
    for(int i=0;i<n;i++){
      if(s.charAt(i)=='B'){
        b++;
      }else{
        r++;
      }
    }
    System.out.println((r>b)?"Yes":"No");
  }
}