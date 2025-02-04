public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        StringBuilder sb = new StringBuilder();
        int m,f,r;
        while(true){
            str = br.readLine().split(" ");
            m = Integer.parseInt(str[0]);
            f = Integer.parseInt(str[1]);
            r = Integer.parseInt(str[2]);
            if(m == -1 && f == -1 && r == -1) break;
            if(m == -1 || f == -1){
                sb.append("F\n");
            }else if(m+f >= 80){
                sb.append("A\n");
            }else if(65 <= m+f){
                sb.append("B\n");
            }else if(50 <= m+f){
                sb.append("C\n");
            }else if(30 <= m+f){
                if(r >= 50) sb.append("C\n");
                else sb.append("D\n");
            }else{
                sb.append("F\n");
            }
        }
        System.out.print(sb);
    }
}
