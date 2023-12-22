import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String[] strArray = N.split("");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);
        int c = Integer.parseInt(strArray[2]);
      
      if((a == b && a < c) || (a < b)){
        a++; 
      }
     System.out.println(a + "" + a + "" + a);

    }
}