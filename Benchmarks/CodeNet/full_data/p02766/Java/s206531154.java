import java.util.Scanner;
class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sc = scanner.nextInt();
    int sc2 = scanner.nextInt();
    int i = Integer.parseInt(Integer.toString(sc,sc2));
//    Integer oi = new Integer(sc);
//    int num1 = Integer.parseInt(sc, sc2);
    int valLen = String.valueOf(i).length(); 
    System.out.println(valLen);
}
}