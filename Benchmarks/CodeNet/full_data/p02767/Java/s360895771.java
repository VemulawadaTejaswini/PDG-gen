import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] point = new int[count];
        for(int index = 0; index < count; index++) {
          point[index] = sc.nextInt();
        }
      
        Arrays.sort(point);
        int min = point[0];
        int max = point[count - 1];
        int answer = Integer.MAX_VALUE;
        for(int n = min; n <= max; n++) {
          int total = 0;
          for(int p : point) {
            total += (int)StrictMath.pow(n - p, 2);
          }
          if(answer > total) {
            answer = total;
          }
        }
        System.out.println(answer);
    }
}