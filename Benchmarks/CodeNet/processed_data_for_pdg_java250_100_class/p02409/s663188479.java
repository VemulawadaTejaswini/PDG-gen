public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][][] info = new int[4][3][10];
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" ");
            int b = Integer.valueOf(input[0])-1;
            int f = Integer.valueOf(input[1])-1;
            int r = Integer.valueOf(input[2])-1;
            int v = Integer.valueOf(input[3]);
            info[b][f][r] += v;
        }
        StringBuilder sb = new StringBuilder();
        for(int b = 0; b < 4; b++){
            for(int f = 0; f < 3; f++){
                for(int r = 0; r < 10; r++){
                    sb.append(" " + info[b][f][r]);
                }
                sb.append("\n");
            }
            if(b != 3)  sb.append("####################\n");
        }
        System.out.print(sb);
    }
}
