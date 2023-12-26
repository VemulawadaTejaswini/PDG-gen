public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
    	Date date = sdFormat.parse(str);
    	String str2 = "2019/05/01";
    	Date date2 = sdFormat.parse(str2);
    	sc.close();
    	System.out.println(date2.after(date) ? "Heisei" : "TBD");
    }
}
