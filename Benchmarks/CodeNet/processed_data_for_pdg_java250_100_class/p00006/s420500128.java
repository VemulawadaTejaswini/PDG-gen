class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuffer sb = new StringBuffer(line);
        String answer = sb.reverse().toString();
        System.out.println(answer);
    }
}
