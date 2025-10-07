import java.util.*;
public class InvertedHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Line do you want to print:");
        int numLine = sc.nextInt();

        for(int i = 1; i <= numLine; i++){
            for(int j = 1; j <= numLine-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}