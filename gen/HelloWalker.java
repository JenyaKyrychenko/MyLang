public class HelloWalker extends HelloBaseListener {
    public void enterR(HelloParser.RContext ctx ) {
        System.out.println( "Entering R : " + ctx.DIGIT(2).getText() );
    }

    public void exitR(HelloParser.RContext ctx ) {
        System.out.println( "Exiting R" );
    }
}