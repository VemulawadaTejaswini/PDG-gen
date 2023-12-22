import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String word ;
        String ans="";
        Scanner input =  new Scanner(System.in);
        word=input.nextLine();

        for(int i =0 ;i<word.length();i++){
            if(word.charAt(i)!='B'){
                ans+=word.charAt(i);
            }
            else{
                if(ans.length()==0){
                    continue;
                }
                else{

                ans+=word.charAt(i);
            }
        }}



        System.out.println(ans);



    }
}