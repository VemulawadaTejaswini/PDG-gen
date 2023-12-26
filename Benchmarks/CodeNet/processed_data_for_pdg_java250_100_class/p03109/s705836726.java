public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String b = scan.next();
        String ans = null;
        if(Integer.parseInt(b.replaceAll("/",""))>20190430){
            ans = "TBD";
        }else{
            ans = "Heisei";
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
