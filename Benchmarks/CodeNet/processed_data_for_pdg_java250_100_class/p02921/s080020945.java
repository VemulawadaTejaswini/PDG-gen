public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s="", t="";
        try {
            s = br.readLine();
            t = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        for (int i=0; i<3; i++){
            if (s.charAt(i) == t.charAt(i)){
               count++;
            }
        }
        System.out.println(count);
    }
}
