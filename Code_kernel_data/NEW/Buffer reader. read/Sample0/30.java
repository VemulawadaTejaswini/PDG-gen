//29
public class func{
	public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
              while((truc=reader.read())!=-1){
                if(truc!=10){
                  str+=(char)truc;
                }else{
                  ent.command(str, bwriter);
                  str="";
                }
              }
              reader.close();
}
}
