public class func{
public void readFromFile(String filename){
        File f = new File(filename);
        if(!f.exists()){  
            throw new FileNotFoundException(filename);  
        }  
            fis = new FileInputStream(f);  
            channel = fis.getChannel();  
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)channel.size());
            channel.read(byteBuffer); 
            return byteBuffer.array();  
}
}
