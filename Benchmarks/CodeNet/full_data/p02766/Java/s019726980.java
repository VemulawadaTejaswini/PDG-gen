import java.util.Scanner;
class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String sc = scanner.next();
    int sc2 = scanner.nextInt();
    Integer oi = new Integer(sc);
    int num1 = Integer.parseInt(sc, sc2);
    int valLen = String.valueOf( num1 ).length(); 
    System.out.println(valLen);
}
}