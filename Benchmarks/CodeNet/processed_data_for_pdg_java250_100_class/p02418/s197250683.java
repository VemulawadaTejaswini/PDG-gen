class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();	
        String p = br.readLine();	
        sb.append(s);				
        sb.append(s);
        if(sb.indexOf(p) != -1){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
     }
}
