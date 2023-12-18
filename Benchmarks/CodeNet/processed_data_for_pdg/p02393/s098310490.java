public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n;
        n = new int[3];
        String str;
        str = scan.next();
        n[0] = Integer.parseInt(str);
        str = scan.next();
        n[1] = Integer.parseInt(str);
        str = scan.next();
        n[2] = Integer.parseInt(str);
        scan.close();
        Arrays.sort(n);
        System.out.println(n[0]+" "+n[1]+" "+n[2]);
    }
}
