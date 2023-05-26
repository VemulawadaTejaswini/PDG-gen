//28
public class func{
public void convert(FileChannel nodesChannel,FileChannel triasChannel,FileChannel soupChannel){
    while(triasChannel.read(trias)>0)
    {
      trias.rewind();
      for(int i=0; i<3; i++)
      {
        int nodeId=trias.getInt();
        nodesChannel.read(nodes, 3*8*nodeId);
        nodes.rewind();
        for(int j=0; j<3; j++)
          toWrite.putDouble(nodes.getDouble());
        nodes.rewind();
      }
      trias.rewind();
      toWrite.rewind();
      soupChannel.write(toWrite);
      toWrite.rewind();
    }
}
}
