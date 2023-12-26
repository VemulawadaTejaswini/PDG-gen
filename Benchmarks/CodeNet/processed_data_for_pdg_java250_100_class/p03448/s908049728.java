public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int cou = 0;
        for(int a = 0 ; a < A + 1 ; a++ ){
            for(int b = 0 ; b < B + 1 ; b++ ){
                int c = (X - 500 * a - 100 * b) / 50;
                if(0 <= c && c <= C){
                    cou++;
                }
            }
        }
        System.out.println(cou);
    }
  }
