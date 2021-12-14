import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count;
        System.out.println("enter natural number");
        num = input.nextInt();
        for (count = 1; count < 1+num; count++)
            System.out.println(num);

    }
}