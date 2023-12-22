import java.util.*;

 public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        long length = L / 3; 
      
        L -= length; 
      
        // finding breadth 
        long breadth = L / 2; 
      
        // finding height 
        long height = L - breadth; 
      
        System.out.println(length*breadth*height);
    }
}