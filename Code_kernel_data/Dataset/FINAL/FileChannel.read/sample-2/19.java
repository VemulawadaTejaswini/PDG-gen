public class func{
public void readEdges(MeshVisu mesh,OEMM.Node current){
          LOGGER.log(Level.FINE, "Reading " + (nbrOfEdgesComponents / 2) + " edges from " + MeshVisuBuilder.getEdgesFile(oemm, current));
        byteBuffer = ByteBuffer.allocate((Integer.SIZE / 8) * nbrOfEdgesComponents);
        bufferInteger = byteBuffer.asIntBuffer();
        byteBuffer.rewind();
        fc.read(byteBuffer);
        bufferInteger.rewind();
        bufferInteger.get(temp);
      ByteBuffer byteBuffer = ByteBuffer.allocate(Integer.SIZE / 8);
      IntBuffer bufferInteger = byteBuffer.asIntBuffer();
      byteBuffer.rewind();
      fc.read(byteBuffer);
}
}
