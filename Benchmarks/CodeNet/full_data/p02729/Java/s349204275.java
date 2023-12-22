import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
	int M = in.nextInt();
    int NA = (N * (N - 1))/2, MA = (M * (M - 1))/2;
    System.out.println(NA + MA);
  }
}