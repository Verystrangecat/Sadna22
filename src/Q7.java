import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count;
        int sum=0;
        System.out.println("Please enter 2 natural numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        if(n1<n2){
            for(count=n1; count<n2+1;count++){
                sum=sum+count;}
            System.out.print("The sum of the numbers is:"+sum);}
        else if(n2<n1){
            for(count=n2; count<n1+1;count++){
            sum=sum+count;}
                System.out.print("The sum of the numbers is:"+sum);}
    }
}


