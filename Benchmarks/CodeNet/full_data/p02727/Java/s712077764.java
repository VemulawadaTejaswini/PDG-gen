import java.util.*;
 
public class Main {
  	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      ArrayList<Integer> redApples = new ArrayList<Integer>();
      for (int i = 0; i < a; i++) {
        redApples.add(sc.nextInt());
      }
      ArrayList<Integer> greenApples = new ArrayList<Integer>();
      for (int j = 0; j < b; j++) {
        greenApples.add(sc.nextInt());
      }
      ArrayList<Integer> colorlessApples = new ArrayList<Integer>();
      for (int k = 0; k < c; k++) {
        colorlessApples.add(sc.nextInt());
      }
      
      Collections.sort(redApples, Collections.reverseOrder());
      Collections.sort(greenApples, Collections.reverseOrder());
      Collections.sort(colorlessApples, Collections.reverseOrder());
      
      ArrayList<Integer> allApples = new ArrayList<Integer>();
      allApples.addAll(redApples.subList(0, x));
      allApples.addAll(greenApples.subList(0, y));
      allApples.addAll(colorlessApples);
      Collections.sort(allApples, Collections.reverseOrder());
      
      long delicious = 0;
      for (int i = 0; i < x + y; i++) {
        delicious += (long)allApples.get(i);
      }
      System.out.println(delicious);
    }
}