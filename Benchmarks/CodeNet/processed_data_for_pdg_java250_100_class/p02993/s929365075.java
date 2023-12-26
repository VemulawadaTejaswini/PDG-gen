public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        String password = sc.next();  
        String ans = "Good";
        for(int i = 0; i < 3; i++) {
            if (password.substring(i,i+1).equals(password.substring(i+1,i+2))) {
                ans = "Bad";
            }
        }
        System.out.println(ans);
    }
}
