public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char [] c = input.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(Character.isUpperCase(c[i])){
                c[i] = Character.toLowerCase(c[i]);
            }else if(Character.isLowerCase(c[i])){
                c[i] = Character.toUpperCase(c[i]);
            }else{
                c[i] = c[i];
            }
        }
        System.out.println(c);
    }
}
