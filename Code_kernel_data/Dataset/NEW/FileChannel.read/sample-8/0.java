//0
public class func{
public void seekAndReadContent(FileChannel source){
        source.position(dataOffset);
        source.read(data);
        this.data.flip();
}
}
