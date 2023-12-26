public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int answer = 0;
        for (char c : input.toCharArray()) {
            answer += c == '1' ? 1 : 0;
        }
        System.out.println(answer);
    }
}
