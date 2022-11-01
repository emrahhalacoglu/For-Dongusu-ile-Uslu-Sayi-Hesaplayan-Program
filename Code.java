import java.util.Scanner;
/**
 * Code
 */
public class Code {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double y=1;
            int x;
            System.out.print("Input x : ");
            x=input.nextInt();
            int n;
            System.out.print("Input n : ");
            n=input.nextInt();

            if(n>=0){
                for(int i=1;i<=n;i++){
                y*=x;
            }
            
            System.out.println("y=x^n => y = "+y);
            }
            else{
                for(int i=1;i<=-n;i++){
                y*=x;
                }
            y=1/y;
            System.out.println("y=x^n => y = "+y);
            }
        }
    }
}