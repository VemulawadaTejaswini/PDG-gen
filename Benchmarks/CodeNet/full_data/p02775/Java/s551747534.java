import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int[] client = new int[s.length()+1];
        int[] cashier = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            client[i+1]=s.charAt(i)-'0';
        }
        for (int i = client.length-1; i >0 ; i--) {
            //check if cachier can boost
            if(client[i]>=10){
                client[i-1]+=client[i]/10;
                client[i] = client[i]%10;
            }
            if(client[i]>5){
                cashier[i]+=10-i;
                client[i-1]+=1;
                client[i]=0;
            }
        }
        int c = 0;
        for (int i = 0; i < client.length; i++) {
            c+=client[i]+cashier[i];
        }
        System.out.println(c);
    }
}