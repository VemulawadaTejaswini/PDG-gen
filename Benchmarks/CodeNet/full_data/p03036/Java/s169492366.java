import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    
    int one = r*x-d;
    int two = r*one-d;
    int three = r*two-d;
    int four = r*three-d;
    int five = r*four-d;
    int six = r*five-d;
    int seven = r*six-d;
    int eight = r*seven-d;
    int nine = r*eight-d;
    int ten = r*nine-d;

    System.out.println(one);
    System.out.println(two);    
    System.out.println(three);
    System.out.println(four);  
    System.out.println(five);
    System.out.println(six); 
    System.out.println(seven);
    System.out.println(eight); 
    System.out.println(nine);
    System.out.println(ten); 
    }
}