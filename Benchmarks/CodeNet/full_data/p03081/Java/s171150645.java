import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    {
      {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int Q = Integer.parseInt(scanner.next());
        String s = scanner.next();
        String[] t = new String[Q];
        String[] d = new String[Q];
        for (int i = 0; i < Q; i++) {
          t[i] = scanner.next();
          d[i] = scanner.next();
        }
        scanner.close();

        int sta_idx = 0;
        int cls_idx = s.length() - 1;
        for (int i = Q - 1; i >= 0; i--) {
          if (s.charAt(cls_idx) == t[i].charAt(0) && d[i].equals("R")) {
            cls_idx--;
          }
          if (s.charAt(sta_idx) == t[i].charAt(0) && d[i].equals("L")) {
            sta_idx++;
          }
          if (cls_idx - sta_idx + 1 <= 0) {
            break;
          }
        }
        System.out.println(cls_idx - sta_idx + 1);
      }
    }
  }

}
