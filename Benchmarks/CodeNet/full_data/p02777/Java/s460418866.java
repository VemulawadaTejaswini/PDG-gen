import java.util.Scanner;


public class Main {
  public static void main(String[] arg){
    // input
    Scanner scan = new Scanner(System.in);
    String[] line = scan.nextLine().split(" ");
    String s = line[0];
    String t = line[1];
    String[] line2 = scan.nextLine().split(" ");
    int a = Integer.parseInt(line2[0]);
    int b = Integer.parseInt(line2[1]);
    String u = scan.nextLine();


    // condition process
    if(u.equals(s)){
      a = a - 1;
    }else{
      b = b - 1;
    }

    // output
    System.out.println(a + " " + b);

  }
}
