    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String [] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            String [] votes = br.readLine().split(" ");
            int [] voteInt = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += Integer.parseInt(votes[i]);
                voteInt[i] = Integer.parseInt(votes[i]);
            }

            int min = sum/(4*m);
            int canSelect = 0;

            for(int i =0; i < n; i++){
                if(voteInt[i] >= min){
                    canSelect++;
                }
            }

            if(canSelect < m){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }

