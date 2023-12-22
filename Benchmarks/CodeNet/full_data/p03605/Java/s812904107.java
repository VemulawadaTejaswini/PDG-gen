import java.io.*;
import java.util.Scanner;

class september{
  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

       if(input % 90 < 10 && input > 10) {
        System.out.print("Yes");
    }else if(input % 10 ==9){
      System.out.print("Yes");
    }else{
        System.out.print("No");
    }
      scanner.close();
  }

  }