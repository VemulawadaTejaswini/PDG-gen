public class Main {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("キミとキミのパートナーの年齢を入力してね！");
        
        try {
            int a = br.read();
            int b = br.read();
            
            if(a%b == 0) {
                System.out.println(a + b);
            } else {
                System.out.println(a - b);
            }
        } catch (IOException e) {
            System.out.println("Partner is not found...why");
            e.printStackTrace();
        }
    }
}