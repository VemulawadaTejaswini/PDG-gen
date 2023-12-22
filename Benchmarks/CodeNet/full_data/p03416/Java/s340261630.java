import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int start= scn.nextInt();
        int end = scn.nextInt();
        int answer = 0;
        for(int i=start;i<=end;i++){
            String buf = String.valueOf(i);
            for(int j=0;j<buf.length()/2;j++){
                char r = buf.charAt(j);
                char l = buf.charAt(buf.length()-1-j);
                if(r!=l){
                    answer--;
                    break;
                }
            }
            answer++;
        }
        System.out.println(answer);
    }
}
