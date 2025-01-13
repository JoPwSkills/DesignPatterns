public class Football extends Game{

    @Override
    void endPlay(){
        System.out.println("Football game is finished");
    }

    @Override
    void initialize(){
        System.out.println("Football Game Initialized!, Start Playing");
    }

    @Override
    void startPlay(){
        System.out.println("Football Game started, Enjoy!!!");
    }

}
