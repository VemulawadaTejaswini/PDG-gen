import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = System.nextLine();
        int newSum = 0;
        int orgSum = 0;
        for( char ch : n.toCharArray()) {
            orgSum += ch -'0';
        }
        newSum = (n.charAt(0) - '0' )-  1;
        for( int i =1; i < n.length(); i++) {
            newSum += 9;   
        }
        System.out.println(Math.max(newSum, orgSum));
    }
}