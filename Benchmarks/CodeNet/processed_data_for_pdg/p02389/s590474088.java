public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);
        int x = a * b;
        int y = a * 2 + b * 2;
        System.out.println(x + " " + y); 
    }   
}
