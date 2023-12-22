import java.util.*;


import java.io.*;

class Main {

  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String S = sc.next();
      if (S.length() == 2) {
        System.out.println(S);
      } else {
        for (int i = 0; i < S.length(); i++) {
          System.out.print(S.charAt(S.length()-i-1));
        }
      }
    }
  }
}
