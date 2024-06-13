import java.util.*;
import java.util.random.*;
public class Rockpaper {
    public static void main(String args[]){
        System.out.println("All the best! Lets play ROCK PAPER AND SCISSOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for paper,2 for scissor :");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerinput = random.nextInt(3);
        if(userinput== computerinput){
            System.out.println("Match Draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1 ){
            System.out.println("CONGRACTULATIONS ! YOU WIN:)");
        }
        else {
            System.out.println("SORRY ! YOU LOOSE:(");
        }
    }
}
