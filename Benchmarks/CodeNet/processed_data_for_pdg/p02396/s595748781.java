class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            int i = 1;
            while((line = br.readLine()) != null){
                if(line.equals("0")){
                    break;
                }
                System.out.println("Case " + i + ": " + line);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
