import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
        while(true){
            String[] rps = {"rock","paper","scissor"};
            String computer_Move =rps[new Random().nextInt(rps.length)];

            String player_Move;

            while(true){
                System.out.println("shoot a move (rock/paper/scissor)");
                player_Move = scanner.nextLine();
                if(player_Move.equals("rock")|| player_Move.equals("paper")|| player_Move.equals("scissor")){
                    break;
                }
                System.out.println(player_Move+" is a invalid move.");
            }
            System.out.println("Computer played: "+computer_Move);

            if(player_Move.equals(computer_Move)){
                System.out.println("The game was a tie!");
            }
            else if (player_Move.equals("rock")){
                if(computer_Move.equals("paper")){
                    System.out.println("You Lost the Game");
                }else if (computer_Move.equals("scissor")){
                    System.out.println("You Won the Game");
                }
            }
            else if (player_Move.equals("paper")){
                if(computer_Move.equals("rock")){
                    System.out.println("You Won the Game");
                }else if (computer_Move.equals("scissor")){
                    System.out.println("You Lost the Game");
                }
            }
            else if (player_Move.equals("scissor")){
                if(computer_Move.equals("paper")){
                    System.out.println("You Won the Game");
                }else if (computer_Move.equals("rock")){
                    System.out.println("You Lost the Game");
                }
            }

            System.out.println("Shot a move again? [yes/no]: ");
            String shotAgain = scanner.nextLine();

            if(!shotAgain.equals("yes")){
                break;
            }
        }  
        scanner.close();  
    }
}