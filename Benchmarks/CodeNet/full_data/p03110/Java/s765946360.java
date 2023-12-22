import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double m=0;
    for(int i=0;i<n;i++){
      double k=sc.nextDouble();
      if(sc.next().equals("JPY")){
        m+=k;
      }else{
        m+=k*380000;
      }
    }
    System.out.println(m);
  }
}