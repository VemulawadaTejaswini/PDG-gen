public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] word = new int[3];
        word[0] = sc.nextInt();
        word[1] = sc.nextInt();
        word[2] = sc.nextInt();
        Arrays.sort(word);
        String out;
        if (word[0] == 5 && word[1] == 5 && word[2] == 7){
            out = "YES";
        } else {
            out = "NO";
        }
        System.out.println(out);
    }
}
