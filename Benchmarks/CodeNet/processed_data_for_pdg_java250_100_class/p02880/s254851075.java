public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int check[] = {2, 3, 4, 5, 6, 7, 8, 9};
        String ans = "No";
        if (n >= 10) {
          for (int i = 0; i < check.length; i++) {
            if (n % check[i] == 0 && n / check[i] < 10) {
              ans = "Yes";
              break;
            }
          }
        } else {
          ans = "Yes";
        }
        System.out.println(ans);
    }
}
