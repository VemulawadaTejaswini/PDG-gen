//138
public class func{
	public void printStatistics(){
            GridTcpDiscoveryNode coord = resolveCoordinator();
            log.info("Discovery SPI statistics [statistics=" + stats + ", spiState=" + spiStateCopy() +
                ", coord=" + coord +
                ", topSize=" + ring.allNodes().size() +
                ", leavingNodesSize=" + leavingNodesSize + ", failedNodesSize=" + failedNodesSize +
                ", msgWorker.queue.size=" + (msgWorker != null ? msgWorker.queue.size() : "N/A") +
                ", lastUpdate=" + (locNode != null ? U.format(locNode.lastUpdateTime()) : "N/A") +
                ", heapFree=" + runtime.freeMemory() / (1024 * 1024) +
                "M, heapTotal=" + runtime.maxMemory() / (1024 * 1024) + "M]");
}
}
