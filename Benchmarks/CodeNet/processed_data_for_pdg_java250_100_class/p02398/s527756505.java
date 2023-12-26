public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String s : str) {
            nums.add(Integer.valueOf(s));
        }
        int count = 0;
        for (int i = nums.get(0); i <= nums.get(1); i++) {
            if (nums.get(2) % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
