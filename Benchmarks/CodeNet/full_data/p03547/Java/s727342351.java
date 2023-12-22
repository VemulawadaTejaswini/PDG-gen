import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0); 
      	char b = sc.next().charAt(0); 
      if((int)a<(int)b){System.out.println("<");}
      else if((int)a>(int)b){System.out.println(">");}
      else if((int)a==(int)b){System.out.println("=");}

    }
}