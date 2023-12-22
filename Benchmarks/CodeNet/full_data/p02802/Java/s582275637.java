import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        int M =scanner.nextInt();

        int count =0;
        int previous=0;
        int penalty=0;
        int win=0;

        for(int i=0; i<M; i++){
            int p=scanner.nextInt();
            String result=scanner.next();
            if(result.equals("ac")){
                if(p!=previous){
                    win++;
                    previous=p;
                    penalty=penalty+count;
                    count=0;
                }
            }else if(result.equals("wc")){
                count++;
            }
        }
        System.out.println(win+" "+penalty);

    }
}




