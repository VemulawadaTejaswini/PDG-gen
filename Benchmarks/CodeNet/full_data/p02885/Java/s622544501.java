import java.lang.Math;
class Curtain {
  public static void main(String[] args) {
    int A = (int) (Math.random() * 99 + 1);
    int B = (int) (Math.random() * 99 + 1);
    if(B*B < A) {
      System.out.println(A - (B*B));
    } else{
      System.out.println(0);
    }
  }
}