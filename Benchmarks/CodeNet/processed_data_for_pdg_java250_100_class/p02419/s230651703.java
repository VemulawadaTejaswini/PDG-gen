class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();	
        String t;
        int count = 0;
        while((t=br.readLine())!=null){
            if("END_OF_TEXT".equals(t) || w.length()>10 || t.length()>1000){
                break;                       
            }								 
            String[] str = t.split(" ");	
            for(int k=0; k<str.length; k++){
            	if(str[k].equalsIgnoreCase(w)){	
            		count++;					
            	}
            }
        }
        System.out.println(count);
     }
}
