package MyProjectPackage;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Guesser{
    int guessernumber;
    public int takefromGuesser(){
        System.out.println("Take the number from Guesser");
        Scanner sc= new Scanner(System.in);
        guessernumber= sc.nextInt();
        return guessernumber;
    }

}
class Player{
    int playernumber;
    public int takefromPlayer(){
        System.out.println("Take the number from player");
        Scanner sc= new Scanner(System.in);
        playernumber= sc.nextInt();
        return playernumber;
    }
}
class Umpire{
    int getNumberGuesser;
    int getNumberplayer1;
    int getNumberplayer2;
    int getNumberplayer3;
    void CollectfromGuesser(){
        Guesser g= new Guesser();
        getNumberGuesser= g.takefromGuesser();
    }
    void CollectfromPlayer(){
        Player p1= new Player();
        getNumberplayer1= p1.takefromPlayer();
        Player p2= new Player();
        getNumberplayer2= p2.takefromPlayer();
        Player p3= new Player();
        getNumberplayer3= p3.takefromPlayer();
    }
    void compare(){
        if(getNumberGuesser== getNumberplayer1){
            if(getNumberGuesser==getNumberplayer2&& getNumberGuesser==getNumberplayer3){
                System.out.println("All the players won");
            } else if (getNumberGuesser==getNumberplayer2) {
                System.out.println("Only player 1 and 2 won");
            } else if (getNumberGuesser== getNumberplayer3) {
                System.out.println("Only player 1 and 3 won");
            }else {
                System.out.println("Only player 1 won");
            }
        } else if (getNumberGuesser==getNumberplayer2) {
            if (getNumberGuesser==getNumberplayer3){
                System.out.println("Only player 2 and 3 won");
            }
            else {
                System.out.println("Only player 2 won");
            }
        } else if (getNumberGuesser==getNumberplayer3) {
            System.out.println("Only player 3 won");
        }
        else {
            System.out.println("No one won the game");
        }
    }

}
public class GuesserProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            Umpire u = new Umpire();
            u.CollectfromGuesser();
            u.CollectfromPlayer();
            u.compare();

            System.out.println("\nDo you want to continue playing? Press 1 to continue or any key other than 1 to exit.");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Exiting game...");
        sc.close();
    }
}
