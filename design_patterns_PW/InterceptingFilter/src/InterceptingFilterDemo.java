public class InterceptingFilterDemo {

    public static void run()
    {
        FilterManager filterManager = new FilterManager(new Target());

        // Adding the filters to the chain
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();

        client.setFilterManager(filterManager);

        client.sendRequest("HOME");
    }
}
