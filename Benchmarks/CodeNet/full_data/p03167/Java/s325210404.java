import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Scratch {
    public static void main(String[] args)throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        long [][]numbers = new long[y][x];
        for(int i =0;i<y;i++){
            String line = br.readLine();
            for(int j =0;j<x;j++){
                if(line.charAt(j)=='#')
                    numbers[i][j]=0;
                else {
                    if(i==0&&j==0)
                        numbers[0][0]=1;
                    else if (i == 0)
                        numbers[i][j] = numbers[i][j - 1];
                    else if (j == 0)
                        numbers[i][j] = numbers[i - 1][j];
                    else
                        numbers[i][j] = numbers[i - 1][j] + numbers[i][j - 1];
                }

            }
        }
        out.println(numbers[y-1][x-1]%1000000007);
        out.flush();
    }
}