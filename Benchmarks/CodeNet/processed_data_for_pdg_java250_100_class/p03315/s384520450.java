public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char c[] = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(c[i] == '+'){
                sum++;
            }else{
                sum--;
            }
        }
        System.out.println(sum);
    }
}
