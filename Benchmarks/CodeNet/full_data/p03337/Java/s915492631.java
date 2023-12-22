import java.util.Scanner;
class A {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("");
     int x = stdIn.nextInt();
     int y = stdIn.nextInt();
    int a = x + y;
    int b = x - y;
    int c = x * y;
    int values[] = {a, b, c};
    int max = values[0];
    
    for (int index = 1; index < values.length; index ++){
      max = Math.max(max, values[index]);
    }
    System.out.println(""+ max);
  }
}
