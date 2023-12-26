public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);
        String s=br.readLine();
       StringTokenizer st=new StringTokenizer(s," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
       if(-1000 <= a && 1000 >= b){
           if(a < b){
               System.out.println("a < b");
           }else if(a > b){
               System.out.println("a > b");
           }else if(a == b){
               System.out.println("a == b");
           }
       }
}
}
