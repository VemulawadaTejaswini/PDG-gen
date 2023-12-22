import java.util.*;

class Main {
  
  public static List<Integer> parseAndSort(String[] sides) {
    List<Integer> list = new ArrayList<Integer>();
    for(String s: sides) {
      list.add(Integer.parseInt(s));
    }
    Collections.sort(list, Collections.reverseOrder());
    return list;
  }
  
  public static boolean isDrawPolygon(List<Integer> sideList) {
    int sum = 0;
    for(int i = 1; i < sideList.size(); i++) {
      sum += sideList.get(i);
    }
    return sideList.get(0) < sum ? true : false;
  }
      
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while(scanner.hasNextLine()) {
      int n = Integer.parseInt(scanner.nextLine());
      
      String[] sides = scanner.nextLine().split(" ", 0);
      
      List<Integer> sideList = parseAndSort(sides);
      String result = isDrawPolygon(sideList) ? "Yes" : "No";
      System.out.println(result);
    }
  }
}