package guessinggame;

class guessGame {
    GuessMachine gm = new GuessMachine();
    private int answer;
    private int guessnum;
    private int guess;

    public guessGame() {
        guessnum = 0;
        answer = (int) (Math.random() * 100 + 1);
        guess = 0;

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
        return guessnum;
    }
    public String submit(){
        if (guess<answer){
            return "You guessed a "+guess+". Too low guess HIGHER";
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
