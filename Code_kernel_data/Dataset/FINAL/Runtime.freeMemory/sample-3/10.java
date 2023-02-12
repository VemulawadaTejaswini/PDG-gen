public class func{
public void changeTexturePack(TexturePackBase newPack){
                memDiff += runtime.totalMemory() - runtime.freeMemory();
                logger.info("done (%.3fs elapsed, mem usage %+.1fMB)\n", timeDiff / 1000.0, memDiff / 1048576.0);
}
}
