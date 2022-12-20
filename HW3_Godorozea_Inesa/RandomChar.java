import java.util.Random;
public class RandomChar
{
	public static void main(String[] args) {
    Random rd = new Random(); 
    char[] array= new char[100];
    for (int i =0; i<array.length;i++){
        array[i]= (char) (rd.nextInt(93) + '!');
    } 
    for (int i =0; i<array.length;i++){
     System.out.print(array[i]);
    } 
}}