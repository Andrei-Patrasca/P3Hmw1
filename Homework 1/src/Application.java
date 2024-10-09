public class Application {
    InputDevice inpDev;
    OutputDevice outDev;
    //Application application;
    private
    int nr1,nr2;

    public Application(InputDevice inpDev, OutputDevice outDev)
    {
        this.inpDev=inpDev;
        this.outDev=outDev;
    }

    public void run()
    {
         nr1 = inpDev.nextInt();
         nr2 = inpDev.nextInt();
        String message="Application started\n";//Today’s lucky numbers are: " + nr1 + ", " + nr2;
        outDev.writeMessage(message);
        //System.out.println("Today’s lucky numbers are: " + nr1 + ", " + nr2);
        //Application application = this;
        this.playGame();
    }

    public void playGame()
    {
        //int player1 = nr1;
        //int player2 = nr2;
        int ok=0,h=0,s=0,cp1=0,cp2=0,c=0;

        while(cp1<5 && cp2<5)
        {
            int player1=inpDev.nextInt();
            int player2=inpDev.nextInt();
            c++;
            System.out.println("Round"+c+":");
            if (player1 > player2) {
                ok = 1;
                h = player1;
                s = player2;
            } else {
                h = player2;
                s = player1;
                ok = 2;
            }


            if ((ok == 1 && h % s != 0) || (ok == 2 && h % s == 0 && s >= 10)) {
                System.out.println("Player1 wins!!");
                cp1++;
            } else if ((ok == 2 && h % s != 0) || (ok == 1 && h % s == 0 && s >= 10)) {
                System.out.println("Player2 wins!!");
                cp2++;
            }
            System.out.println("Score:"+cp1+","+cp2);
        }

        if(cp1==5)
        System.out.println("Player1 is the final winner!!");
        else
        System.out.println("Player2 is the final winner!!");
    }
}
