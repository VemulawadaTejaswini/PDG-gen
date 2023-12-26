class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;
        while((n=br.readLine())!=null){
            if("-".equals(n)){
                break;                       
            }
            String str = n;                  
            int shuffle = Integer.parseInt(br.readLine());    
            for(int i=0; i<shuffle; i++){                     
                int h = Integer.parseInt(br.readLine());      
                str = str.substring(h) + str.substring(0,h);  
            }
            System.out.println(str);
        }
    }
}
