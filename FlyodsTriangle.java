import java.util.*;
public class FlyodsTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINE :");
        int numLine = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= numLine; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println("");
        }
    }
}