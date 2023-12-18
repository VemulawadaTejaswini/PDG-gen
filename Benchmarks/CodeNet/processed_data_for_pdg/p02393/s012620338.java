public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] tmp = new int[3];
        tmp[0] = a;
        tmp[1] = b;
        tmp[2] = c;
        Arrays.sort(tmp);
        StringBuilder ret = new StringBuilder();
        for (int i : tmp) {
        	ret.append(" ");
			ret.append(i);
		}
        System.out.println(ret.delete(0, 1).toString());
    }
}
