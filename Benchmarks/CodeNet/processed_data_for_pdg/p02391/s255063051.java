class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] strAry = line.split(" ");
            int a = Integer.parseInt(strAry[0]);
            int b = Integer.parseInt(strAry[1]);
            if(a < b){
            	System.out.println("a < b");
            }else if(a > b){
            	System.out.println("a > b");
            }else if(a == b){
            	System.out.println("a == b");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
