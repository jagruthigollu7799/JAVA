import java.util.Scanner;
public class sep2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter a number:");
        int b = sc.nextInt();
        System.out.println("Enter a number:");
        int c = sc.nextInt();
        System.out.println("TOTAL:"+ (a+b+c));
        System.out.println("Average:"+(a+b+c)/3);
    }
}
