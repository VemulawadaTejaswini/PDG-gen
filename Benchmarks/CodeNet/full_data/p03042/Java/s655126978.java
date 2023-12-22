import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] MM = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    String line = scanner.next();
    String before = line.substring(0, 2);
    String after = line.substring(2, 4);
    if(Arrays.asList(MM).contains(before) && Arrays.asList(MM).contains(after)){
      System.out.println("AMBIGUOUS");
    }
    else if(Arrays.asList(MM).contains(before)){
      System.out.println("MMYY");
    }
    else if(Arrays.asList(MM).contains(after)){
      System.out.println("YYMM");
    }
    else {
      System.out.println("NA");
    }
  }
}