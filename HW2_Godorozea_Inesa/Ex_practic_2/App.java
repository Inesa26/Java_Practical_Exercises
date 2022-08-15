import java.util.Scanner;
public class App{
	public static void main (String[] args){
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the first value");
    int a = sc.nextInt();
    System.out.println("Enter the second value");
    int b = sc.nextInt();
    System.out.println (a + "+" + b + "=" + Calculator.sum(a,b));
    System.out.println (a + "-" + b + "=" + Calculator.difference(a,b));
    System.out.println (a + "*" + b + "=" + Calculator.product(a,b));
    System.out.println (a + "/" + b + "=" + Calculator.quotient(a,b));

	}
}