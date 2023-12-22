import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String X = sc.next();
    sc.nextLine();
    int[] coordinates = Arrays.stream((X + " " + sc.nextLine()).split(" "))
      .mapToInt(Integer::parseInt)
      .sorted()
      .toArray();
    Set<Integer> distanceSet = new HashSet<>();
    for (int i = 0; i < coordinates.length-1; i++) {
      distanceSet.add(Math.abs(coordinates[i] - coordinates[i+1]));
    }
    int minGCD = 0;
    int preDistance = 0;
    for (Integer curDistance : distanceSet) {
      if (preDistance == 0) {
        minGCD = curDistance;
        preDistance = curDistance;
        continue;
      }
      minGCD = Math.min(minGCD, getGCD(curDistance,preDistance));
      if (minGCD == 1) break;
    }
    System.out.println(minGCD);
  }
  private static int getGCD(int a, int b) {
    if (a < b) {int t = a; a = b; b = t;}
    if (b < 1) return -1;
    if (a%b == 0) return b;
    return getGCD(b, a%b);
  }
}