import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count;
        System.out.println("Please enter 2 natural numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        if(n1<n2){
        for(count=n1; count<n2+1;count++)
            System.out.print(count+" ");}
        else if(n2<n1){
            for(count=n2; count<n1+1;count++)
                System.out.print(count+" ");}
        }
    }
