public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        int y = 1;
          for(int i = 0; i <= b; i++) {
              if(i < a) {
                  continue;
              }else if(i >= a && i < b) {
                  if(c % i == 0) {
                      count ++;
                      }                  
              }else if(i == b) {
                  if(c % i == 0) {
                      count ++;
                      }
                  }
            }
          if(1 <= a && a <= 10000 &&
             1 <= b && b <= 10000 &&
             1 <= c && c <= 10000 && a <= b) {
              System.out.println(count);
          }
    }
}
