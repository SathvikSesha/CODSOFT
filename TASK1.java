package CODSOFT;
import java.util.Random;
import java.util.Scanner;
public class TASK1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random num=new Random();
        int totalRounds=0;
        int roundwon=0;
        System.out.println("Welcome to the Number Game");
        do{
            System.out.println("New round");
            int computernumber=num.nextInt(100)+1;
            int maxAttempts=5;
            int attempts=0;
            while(attempts<maxAttempts){
                System.out.print("Guess the number:");
                int userguess=sc.nextInt();
                if(computernumber==userguess){
                    System.out.println("The guess is correct!");
                    roundwon++;
                    break;
                }
                else if(computernumber<userguess && userguess-computernumber>10){
                    System.out.println("Too high");
                }
                else if(computernumber>userguess && computernumber-userguess>10){
                    System.out.println("Too low");
                }
                else{
                    System.out.println("Close to number");
                }
                attempts++;
            }
            totalRounds++;
            System.out.println("Play the game again!");
            System.out.print("Enter yes/no:");
            String play=sc.next().toLowerCase();
            if(play.equals("no")){
                break;
            }
            System.out.println();
        }while(true);
        System.out.println();
        System.out.println("After the game play");
        System.out.println("Total rounds played:"+totalRounds);
        System.out.println("Rounds Won:"+roundwon);
        sc.close();
    }
}