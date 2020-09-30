package guessinggame;

class guessGame {
    GuessMachine gm = new GuessMachine();
    private int number;
    private int numguesses;
    private int myguess;

    public guessGame() {
        numguesses = 0;
        number = (int) (Math.random() * 100 + 1);
        myguess = 0;

    }

    public boolean setGuess(int num) {
        if (num > 100 || num < 0) {
            return false;
        }
        myguess = num;
        numguesses += 1;
        return true;

    }

    public String giveResult() {
        if (myguess == number) {
            return "You got it";
        } else if (myguess < number) {
            return "Too low";
        } else {
            return "Too High";
        }
    }

    public int getNumGuess() {
        return numguesses;
    }
    public void submit(){
        if (guess<answer){
            gm.answerlbl.setText("You guessed a "+guess+". Too low guess HIGHER");
        }
        else if(guess>answer)
        {
            System.out.println("You guessed a "+guess+". Too high guess LOWER");
        }
        else if(guess==answer){
            System.out.println("Number was "+answer+"You got it");
        }
    }
}
