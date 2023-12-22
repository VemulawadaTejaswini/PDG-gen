import java.util.Scanner;

class Main {

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static void main(String[] args) {
        String word ;
        Scanner input =  new Scanner(System.in);
        word=input.nextLine();

        for(int i =0 ;i<word.length();i++){
            if(word.charAt(i)=='B'&&i!=0){
                word=charRemoveAt(word, i-1);

            }
        }
        word=word.replace("B","");


        System.out.println(word);



    }
}