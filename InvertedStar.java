import java.util.*;

public class InvertedStar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER HOW MANY LINE YOU WANT TO PRINT :");
        int numLine = sc.nextInt();

        for(int i = 1; i <= numLine; i++){
            for(int j = 1; j <= (numLine - i) + 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}