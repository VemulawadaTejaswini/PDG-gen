import java.util.Random;
public class Main {
  public static void main(int n,int a,int b){
  	int max = 0;
    int min = 0;
    if(a < b){
      max = a;
    }else {
      max = b;
    }
    Random random = new Random();
	min = random.nextInt(max);
    System.out.print(max + " " + min);
  }
}