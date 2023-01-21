import java.util.Scanner;
public class fizz_buzz{

    public static void main (String abc[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Range???");
        int a=input.nextInt();

        for (int i=1;i<=a;i++){
            if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}