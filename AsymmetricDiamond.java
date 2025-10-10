import java.util.*;
public class AsymmetricDiamond{

    public static void asymmetricDiamondPrint(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Line Do You Want to Print : ");
        int numLine = sc.nextInt();

        asymmetricDiamondPrint(numLine);
    }
}