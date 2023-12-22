public class Main{

        public static void main(String[] args){

                String firstSt = args[0].toUpperCase();
                String secandSt = args[1].toUpperCase();
                String thirdSt = args[2].toUpperCase();

                char[] first = firstSt.toCharArray();
                char[] secand = secandSt.toCharArray();
                char[] third = thirdSt.toCharArray();

                char[] answer = new char[3];
                answer[0] = first[0];
                answer[1] = secand[0];
                answer[2] = third[0];

                String ansSt = String.valueOf(answer);
                System.out.println(ansSt);
        }

}