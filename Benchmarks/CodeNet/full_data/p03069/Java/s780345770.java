import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        char[] c = s.toCharArray();
        int count = 0;
        
        for (int i = 0; i < n-1; i++) {
            if (c[i] == '#' && c[i+1] == '.') {
                c[i+1] = '#';
                count++;
            }
            if(c[i] == '#' && c[i+1] == '.' && c[i+2] == '.' ) {
                c[i+2] = '#';
                count++;
            }
        }
        System.out.println(count);
    } 
}    