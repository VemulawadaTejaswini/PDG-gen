public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.toUpperCase();
        String str3 = str.toLowerCase();
        String ans ="";
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)==str2.charAt(i)) {
        		ans =ans +  String.valueOf(str3.charAt(i));
        	}else {
        		ans = ans + String.valueOf(str2.charAt(i));
        	}
        }
        System.out.println(ans);
        sc.close();
    }
}
