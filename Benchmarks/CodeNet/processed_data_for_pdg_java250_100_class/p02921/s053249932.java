public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[] before = scan.next().toCharArray();
        char[] after = scan.next().toCharArray();
        int answer = 0;
        for(int i = 0; i < 3; i++){
            if(before[i] == after[i]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
