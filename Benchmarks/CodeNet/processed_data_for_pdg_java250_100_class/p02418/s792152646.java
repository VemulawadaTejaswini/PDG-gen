public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            char[] arr = s.toCharArray();
            sb.append(s);
            for(int i=0; i<arr.length-1; i++){
                sb.append(arr[i]);
            }
            s = new String(sb);
            String p = br.readLine(); 
            if(s.contains(p)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
