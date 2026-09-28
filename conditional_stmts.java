import java.util.Scanner;

public class conditional_stmts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your age:");
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("Eligible for vote");
        // } else {
        //     System.out.println("Not eligible");
        // }
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        if(num % 2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
