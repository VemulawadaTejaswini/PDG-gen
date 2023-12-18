class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String sNyuryoku=br.readLine();
        int i=0;
        while(!sNyuryoku.equals("0")){
            i++;
            sb.append("Case ").append(i).append(": ").append(sNyuryoku).append("\n");
            sNyuryoku=br.readLine();
        }
        System.out.print(sb);
    }
}
