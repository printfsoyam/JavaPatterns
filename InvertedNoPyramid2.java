import java.util.*;
public class InvertedNoPyramid2{

    public static void invertedNumberPyramid(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= (n-i)+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many line do you want to print : ");
        int lineNum = sc.nextInt();

        invertedNumberPyramid(lineNum);
    }
}