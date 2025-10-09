import java.util.*;
public class HollowRectangle{

    public static void hollowRectanglePrint(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter Number Of Columns: ");
        int numCols = sc.nextInt();

        hollowRectanglePrint(numRows,numCols);

    }
}