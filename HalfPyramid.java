import java.util.*;
public  class HalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER HOW MANY LINE DO YOU WANT TO PRINT :");
        int numLine = sc.nextInt();

        for(int i = 1; i <= numLine; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}