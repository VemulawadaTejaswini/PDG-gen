public class CheckFee {
  public static void main (String args[]){
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  
  if(a >= 13){
    System.out.println(b);
  }
  if(6 <= a <= 12){
    System.out.println(b /2);
  }
  if(a <= 5){
    System.out.println("0");
  }
}
}