//45
public class func{
public void getSegment(final URI uri,final int index){
        final Iterable<String> parts = Splitter.on('/').omitEmptyStrings().trimResults().split(path);
        final int size = Iterables.size(parts);
        if (actualIndex < 0 || actualIndex > size - 1) {
            return Optional.absent();
        }
        return Optional.of(Iterables.get(parts, actualIndex) + (uri.getFragment() == null ? "" : "#" + uri.getRawFragment()));
}
}
