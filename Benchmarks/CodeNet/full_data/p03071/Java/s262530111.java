import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    int c = a+a;
    int d = a+b;
    int e = b+b;

    int[] f ={c,d,e};
    int max = f[0];
    for(int i = 0;i < f.length; i++){
      max = Math.max(max,f[i]);
    }
    if(c == d && c == e){
    System.out.println(max);
  }else{
    System.out.println(max -1);
  }
  }
}
