public class func{
public void epochSeconds(){
    Calendar standard = Calendar.getInstance();
    standard.set(2012, 5, 6);
    logger.debug("standard : " + standard.getTime());
    Calendar now = Calendar.getInstance();
    logger.debug("now : " + now.getTime());
    logger.debug("epochSeconds : " + RankingUtils.epochSeconds(standard, now));
}
}
