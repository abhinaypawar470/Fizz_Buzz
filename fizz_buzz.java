import java.util.Scanner;
public class fizz_buzz{

    public static void main (String abc[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Range???");
        int a=input.nextInt();
        int full=10;

        for (int i=1;i<=a;i++){
            if (i%3==0){
                System.out.print("Fizz");
            }
            else if (i%5==0){
                System.out.print("Buzz");
            }
            else{
                System.out.print(i);
            }
            System.out.print("\t");
            if(i==full){
                System.out.println();
                full=full+10;
            }
        }
    }
}