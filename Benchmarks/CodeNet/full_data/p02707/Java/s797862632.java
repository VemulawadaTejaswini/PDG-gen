    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            String [] line = br.readLine().split( " ");
            int [] count = new int[N+1];

            for(int i = 0; i < line.length; i++){
                count[Integer.parseInt(line[i])]++;
            }

            for(int i = 1; i < count.length; i++){
                System.out.println(count[i]);
            }
        }
    }