class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
        	System.out.println((int)Math.pow(Integer.valueOf(line),3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
