public class func{
public void main(String[] args){
    OptArgLoop: for (i = 0; i < args.length - REQUIRED_ARGS; i++) {
      switch (args[i]) {
      case "-serializer:format":
        i++;

        switch (args[i]) {
        case "java":
          break;
        case "kryo":
          serializer = new KryoSliceSerializer();
          break;
        default:
          PrintUsageAndQuit(null);
        }

        break;
      case "-instances":
        readInstances = true;

        break;
      default:
        break OptArgLoop;
      }
    }
      URI location = new URI(args[i]);
        if (location.getFragment() == null) {
          PrintUsageAndQuit("uri must have fragment for partition slice");
        }
        partitionUUID = UUID.fromString(location.getFragment());
}
}
