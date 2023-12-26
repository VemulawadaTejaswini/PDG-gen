public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int ans_int = 0;
        String ans = "";
        int temp_int1 = 0;
        String str1 = scan.next();
        String list_s[] = str1.split("");
        double ans_dob = 0;
        ans="Yes";
        for(int i = 1;i<list_s.length+1;i++){
            if(i%2!=0){
                if(list_s[i-1].equals("L")){
                    ans="No";
                    break;
                }
            }else{
                if(list_s[i-1].equals("R")){
                    ans="No";
                    break;
                }
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
