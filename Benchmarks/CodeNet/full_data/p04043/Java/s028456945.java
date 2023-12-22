public class Main {
    public static void main(final String args[]) {
        String answer = "YES";
        final String[] haiku = args;
        int sum = 0;
        for(int i = 0; i < 3; i++){
          if(haiku[i] == "7" || haiku[i] == "5"){
              sum = sum + Integer.valueOf(haiku[i]);
          }
          else{
              answer = "NO";
          }
        } 
        if(sum != 17){
            answer = "NO";
        }
        System.out.println(answer);
    }

}