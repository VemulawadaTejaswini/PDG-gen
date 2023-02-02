//5
public class func{
public void readFromFile(String filename){
        File f = new File(filename);
        if(!f.exists()){  
            throw new FileNotFoundException(filename);  
        }  
            fis = new FileInputStream(f);  
            channel = fis.getChannel();  
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)channel.size());  //may needn't convert from NBO to HBO as we use ByteBuffer here.
            channel.read(byteBuffer); 
            return byteBuffer.array();  
}
}
