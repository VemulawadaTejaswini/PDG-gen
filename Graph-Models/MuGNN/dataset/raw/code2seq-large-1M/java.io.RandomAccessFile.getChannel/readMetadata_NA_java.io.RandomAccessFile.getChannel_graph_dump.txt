Line_2 $$ public static AVList readMetadata(File file) throws IOException --> Line_3 $$ AVList metadata = null [CD]
Line_2 $$ public static AVList readMetadata(File file) throws IOException --> Line_4 $$ RandomAccessFile sourceFile = null [CD]
Line_4 $$ RandomAccessFile sourceFile = null --> Line_6 $$ sourceFile = open(file) [FD]
Line_2 $$ public static AVList readMetadata(File file) throws IOException --> Line_6 $$ sourceFile = open(file) [FD]
Line_4 $$ RandomAccessFile sourceFile = null --> Line_7 $$ FileChannel channel = sourceFile.getChannel() [FD]
Line_6 $$ sourceFile = open(file) --> Line_7 $$ FileChannel channel = sourceFile.getChannel() [FD]
Line_3 $$ AVList metadata = null --> Line_8 $$ metadata = new AVListImpl() [FD]
Line_7 $$ FileChannel channel = sourceFile.getChannel() --> Line_9 $$ readUHL(channel, DTED_UHL_OFFSET, metadata) [FD]
Line_3 $$ AVList metadata = null --> Line_9 $$ readUHL(channel, DTED_UHL_OFFSET, metadata) [FD]
Line_8 $$ metadata = new AVListImpl() --> Line_9 $$ readUHL(channel, DTED_UHL_OFFSET, metadata) [FD]
Line_7 $$ FileChannel channel = sourceFile.getChannel() --> Line_10 $$ readDSI(channel, DTED_DSI_OFFSET, metadata) [FD]
Line_3 $$ AVList metadata = null --> Line_10 $$ readDSI(channel, DTED_DSI_OFFSET, metadata) [FD]
Line_8 $$ metadata = new AVListImpl() --> Line_10 $$ readDSI(channel, DTED_DSI_OFFSET, metadata) [FD]
Line_7 $$ FileChannel channel = sourceFile.getChannel() --> Line_11 $$ readACC(channel, DTED_ACC_OFFSET, metadata) [FD]
Line_3 $$ AVList metadata = null --> Line_11 $$ readACC(channel, DTED_ACC_OFFSET, metadata) [FD]
Line_8 $$ metadata = new AVListImpl() --> Line_11 $$ readACC(channel, DTED_ACC_OFFSET, metadata) [FD]
Line_4 $$ RandomAccessFile sourceFile = null --> Line_13 $$ close(sourceFile) [FD]
Line_6 $$ sourceFile = open(file) --> Line_13 $$ close(sourceFile) [FD]
Line_2 $$ public static AVList readMetadata(File file) throws IOException --> Line_15 $$ return metadata [CD]
