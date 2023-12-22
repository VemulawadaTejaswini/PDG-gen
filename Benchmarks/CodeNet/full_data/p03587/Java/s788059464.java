import java.util.*;

public class Main {
public static void main(String [] args) {
  int total = 0;
  Scanner sc = new Scanner (System.in);
  String line = sc.nextLine();
  for(int I = 0; I < line.length(); I++){
    char c = line.charAt(I);
    if (c == '1') {
    total++;
    }
  }
  System.out.println(total);

}}
