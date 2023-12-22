public class Main{
  public static void main(String[] args){
    int a=new java.util.Scanner(System.in).nextInt();
    int b=new java.util.Scanner(System.in).nextInt();
    int i;
    int sum=0;
    for(i=0;i<2;i++){
      if(a>b){
        sum+=a;
        a--;
      }else{
        sum+=b;
        b--;
      }
    }
    System.out.println(sum);
  }
}