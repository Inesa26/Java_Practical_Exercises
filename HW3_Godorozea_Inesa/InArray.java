import java.util.Random;
import java.util.Scanner;
public class InArray
{
	public static void main(String[] args) {
    Random rd = new Random(); 
    Scanner sc = new Scanner(System.in);
    boolean flag = false;
    int[] array= new int[5];
    for (int i =0; i<array.length;i++){
        array[i]= rd.nextInt(50);
    } 
  System.out.println("Please enter your number:");
  int number = sc.nextInt();
  for (int i=0; i<array.length; i++){
      if (array[i]==number) flag = true;
  }
    if(flag==true)  System.out.println("Numarul introdus se regaseste in array");
      else System.out.println("Numarul introdus nu se regaseste in array");
  
}}