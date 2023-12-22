public class Test {

        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                int k = Integer.parseInt(args[1]);
                boolean resultFlg = false;

                int cnt = 0;
                for(int i=0; i<n; i+=2) {
                        cnt ++;
                        if(k <= cnt) resultFlg = true;
                }

                if(resultFlg) System.out.println("Yes");
                else System.out.println("No");
        }

}