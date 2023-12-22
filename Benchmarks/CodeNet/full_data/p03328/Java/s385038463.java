import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String firstInput[] = str.split("[\\s]+");
        int a = Integer.parseInt(firstInput[0]);
        int aPos = 0;
        int b = Integer.parseInt(firstInput[1]);
        int bPos = 0;
        int[] builds = new int [999];
        builds[0] = 1;
        for(int i = 1; i < builds.length; i++) {
          builds[i] = builds[i-1] + (i+1);
        }

        for(int i = 0; i < builds.length; i++) {
          if(builds[i] > a) {
            aPos = i;
            break;
          }
        }
        for(int i = aPos; i < builds.length; i++) {
          if(builds[i] > b) {
            bPos = i;
            break;
          }
        }
        if(builds[aPos] - a == builds[bPos] - b) {
          System.out.println(builds[aPos] - a);
        }
    }
}