import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        int N = Integer.parseInt(firstLine);

        String secondLine = br.readLine();
        String[] secondLineArray = secondLine.split(" ");

        int[] result = new int[secondLineArray.length];
        for(int i = 0; i < secondLineArray.length; i++){
            result[Integer.parseInt(secondLineArray[i])-1] = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(result[0]);
        for(int i = 1; i < result.length; i++){
            sb.append(" ").append(result[i]);
        }
        System.out.print(sb);
    }
}