public class Main {
    Main(){
        int table[] = new int[3];
        Scanner sc = new Scanner(System.in);
        table[0] = sc.nextInt();
        table[1] = sc.nextInt();
        table[2] = sc.nextInt();
        java.util.Arrays.sort(table);
        System.out.println(table[0] + " " + table[1] + " " + table[2]);
    }
    public static void main(String[] args){
        new Main();
    }
}
