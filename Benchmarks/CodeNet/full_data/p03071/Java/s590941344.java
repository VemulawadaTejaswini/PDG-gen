public class Main {
  public static void main(String[] args){
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int sum=0;
    
    for(int i=0;i<2;i++){
      if(a<b){
        sum+=b;
        b--;
      } else {
        sum+=a;
        a--;
      }
    }
    System.out.println(sum);
  }
}