import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
      
      if(n.charAt(0)==n.charAt(1)&&(n.charAt(1)==n.charAt(2))||(n.charAt(1)==n.charAt(3))){
        System.out.print("Yes");
      }else{
        System.out.print("No");
      }
      
      
    }
}