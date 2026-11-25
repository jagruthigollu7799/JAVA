import java.util.Scanner;
public class mon{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (a):");
        int a = sc.nextInt();
        System.out.println("Enter a number (b):");
        int b = sc.nextInt();

        if(a<=b){
            System.out.println("b is greater than a ");
        }else{
            System.out.println("a is greater than b");
        }
        sc.close();

    }
}
