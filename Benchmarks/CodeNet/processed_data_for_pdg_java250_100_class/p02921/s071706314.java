public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String y = sc.next();
                String j = sc.next();
                int result = 0;
                for (int i = 0; i < y.length(); i++) {
                        if (y.charAt(i) == j.charAt(i)) {
                                result += 1;
                        }
                }
                System.out.println(result);
        }
}
