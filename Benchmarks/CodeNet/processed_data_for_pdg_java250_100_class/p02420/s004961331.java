public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            sb.delete(0,sb.length());
            String line = br.readLine();
            sb.append(line);
            if (line.equals("-")) break;
            int m = Integer.parseInt(br.readLine());
            for (int i=0; i<m; i++){
                int hi = Integer.parseInt(br.readLine());
                sb.append(sb.substring(0,hi));
                sb.delete(0,hi);
            }
            System.out.println(sb.toString());
        }
    }
}
