public class func{
public void create(FileChannel fc,ByteOrder tiffFileOrder){
        ByteBuffer header = ByteBuffer.wrap(new byte[12]).order( tiffFileOrder );
            fc.read( header );
            header.flip();
            int type = getUnsignedShort( header );
            long count = getUnsignedInt( header );
            if ( type == Tiff.Type.SHORT && count == 1 )
            {
                int upper = getUnsignedShort( header );
                int lower = getUnsignedShort( header );
                long value = (MASK_USHORT & upper) << 16 | (MASK_USHORT & lower);
                return new TiffIFDEntry(tag, type, value );
            }
            else if( count == 1 && (type == Tiff.Type.LONG || type == Tiff.Type.FLOAT))
            {
                long value = header.getInt();
                return new TiffIFDEntry(tag, type, value );
            }
            else
            {
                long offset = getUnsignedInt( header );
                int size = MASK_USHORT & (int)calcSize( type, count );
                if( size > 0L )
                {
                    ByteBuffer data = ByteBuffer.allocateDirect( size ).order( tiffFileOrder );
                    savedPosition = fc.position();
                    fc.position( offset );
                    fc.read( data );
                    data.flip();
                    fc.position( savedPosition );
                    savedPosition = 0;
                    return new TiffIFDEntry(tag, type, count, offset, data );
                }
                else
                    return new TiffIFDEntry(tag, type, count, offset );
            }
}
}
