public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s  = in.nextLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int act = 0;
        String tasks = in.nextLine();
        for (String t : tasks.split(" ")) {
            act = act + Integer.parseInt(t);
        }
        int res = n - act;
        if (res < 0) {
            System.out.println("-1");
        } else {
            System.out.println(res);
        }
    }
}
