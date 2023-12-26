public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            if(str.equals("-")){
                break;
            }
           StringBuilder aabc =new StringBuilder(str);
           int L = aabc.length();
           str = br.readLine();
           int m = Integer.parseInt(str);
           for(int i=0;i<m;i++){
            str = br.readLine();
            int h = Integer.parseInt(str);
            String temp = aabc.substring(0,h);
            aabc.append(temp);
            aabc.delete(0,h);
           }
           System.out.println(aabc.toString());
        }
    }
}
