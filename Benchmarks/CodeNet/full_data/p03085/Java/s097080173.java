import java.io.*;
import java.util.*;

class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char C = sc.next().charAt(0);
    switch (C)
    {
      case 'A':
        System.out.println("T");
        break;
      case 'T':
        System.out.println("A");
        break;
      case 'C':
        System.out.println("G");
        break;
      case 'G':
        System.out.println("C");
        break;
    }
  }
}
