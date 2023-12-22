import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      String[] a = new String[10];
      
      for (int i = 0; i < a.length; i++){
        a[i] = sc.next();
      }
      
      if (a[0] == "0" || a[0] == "1"){
        System.out.println("Heisei");
      } else if (a[0] == "2" && a[1] == "0" && a[2] == "0"){
        System.out.println("Heisei");
      } else if (a[0] == "2" && a[1] == "0" && a[2] == "1" && a[3] != "9"){
        System.out.println("Heisei");
      } else if (a[0] == "2" && a[1] == "0" && a[2] == "1" && a[6] == "1"){
      	System.out.println("Heisei");
      } else if (a[0] == "2" && a[1] == "0" && a[2] == "1" && a[6] == "2"){
        System.out.println("Heisei");
      } else if (a[0] == "2" && a[1] == "0" && a[2] == "1" && a[6] == "3"){
        System.out.println("Heisei");
      } else if (a[0] == "2" && a[1] == "0" && a[2] == "1" && a[6] == "4"){
        System.out.println("Heisei");
      } else {
        System.out.println("TBD");
      }
       
      sc. close();
    }
}

