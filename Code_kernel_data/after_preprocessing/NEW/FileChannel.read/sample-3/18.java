//18
public class func{
public void calculateMD5Hash(FileChannel ch){
        while ((nRead = ch.read(bb)) != -1)
        {
            if (nRead == 0)
            {
                continue;
            }
            bb.position(0);
            bb.limit(nRead);
            d.update(bb);
            bb.clear();
        }
}
}
