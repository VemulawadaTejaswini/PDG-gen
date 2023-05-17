public class func{
public void update(File inputFile,MetaFileReader mfr,RangeLoader rangeLoader,MakeContext mc,File newFile){
            log.trace("number of map entries: " + mc.fileMap.length);
            for (int i = 0; i < mc.fileMap.length; i++) {
                mc.fileOffset = mc.fileMap[i];
                if (mc.fileOffset != -1) {
                    log.trace("  read block from local file: " + mc.fileOffset);
                    rChannel.read(buffer, mc.fileOffset);
                    buffer.flip();
                    wChannel.write(buffer);
                    buffer.clear();
                } else {
                    log.trace("   read block from remote file");
                    if (!mc.rangeQueue) {
                        rangeList = rangeLookUp(i, mfr.getBlocksize(), mc);
                        range = rangeList.size();
                        data = rangeLoader.get(rangeList);
                    } else {
                        log.trace("     already have queued ranges: " + rangeList.size());
                    }
                    blockLength = calcBlockLength(i, mfr.getBlocksize(), (int) mfr.getLength());
                    int offset = (range - rangeList.size()) * mfr.getBlocksize();
                    buffer.put(data, offset, blockLength);
                    buffer.flip();
                    wChannel.write(buffer);
                    buffer.clear();
                    rangeList.remove(0);
                    if (rangeList.isEmpty()) {
                        mc.rangeQueue = false;
                    }
                }
            }
}
}
