import java.util.Scanner;
public class mon{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        System.out.println("Enter first number a:");
        int a = sc.nextInt();
        System.out.println("Enter second number b:");
        int b = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b!=0){
                System.out.println(a/b);
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
