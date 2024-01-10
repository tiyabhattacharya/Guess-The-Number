import java.util.Random;
import java.util.Scanner;


class Game{
    public int number;
    public int noOfGuesses;
    public int inputNumber;


    public void setNoOfGuesses(int noOfGuesses){
          this.noOfGuesses = noOfGuesses;
          

    }
    public int getNoOfGuessses(){
        return noOfGuesses;
    }

    public Game(){
         Random rand=new Random();

         this.number=rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputNumber= sc.nextInt();
        
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.printf("Yes!! You guessed it right, it was %d \n You guessed it in %d attempts", number,noOfGuesses);
            System.out.println();
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low");
            return false;
        }
        else if(inputNumber>number){
            System.out.println("too high");
            return false;
        }
        else{
            return false;
        }
         
    }
    
}



public class guessTheNumber {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b;
        b=false;
        while(!b){
        g.takeUserInput();
        b=g.isCorrectNumber();
        System.out.println(b);
        }
        
    }
}
