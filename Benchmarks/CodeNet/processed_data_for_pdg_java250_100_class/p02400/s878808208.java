class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final DecimalFormat df = new DecimalFormat("0.########");
    public static void main(String[] Args) throws IOException {
        double r = Double.parseDouble(br.readLine());
        System.out.println(df.format(Math.PI*r*r)+" "+df.format(2.0*Math.PI*r));
    }
}
