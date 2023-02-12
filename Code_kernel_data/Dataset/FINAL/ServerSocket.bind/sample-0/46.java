public class func{
public void setup(ExecutorType clientExecutor,ExecutorType serverExecutor,PayloadSize requestSize,PayloadSize responseSize,FlowWindowSize windowSize,ChannelType channelType,int maxConcurrentStreams,int channelCount){
      sock.bind(new InetSocketAddress(BENCHMARK_ADDR, 0));
      SocketAddress address = sock.getLocalSocketAddress();
      sock.close();
      serverBuilder = NettyServerBuilder.forAddress(address);
      channelBuilder = NettyChannelBuilder.forAddress(address);
}
}
