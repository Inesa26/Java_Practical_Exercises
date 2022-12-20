import java.util.Random;
public class SumArray{
	public static void  main(String[] args){
Random rd = new Random(); 
int x = rd.nextInt(50); 
int sumOfArray =0;
int array[] = new int [x];
for (int i =0; i<array.length; i++){
array[i]=rd.nextInt(10);
sumOfArray+=array[i];
}
for (int i =0; i<array.length; i++){
System.out.print(array[i]+" ");
}
System.out.print(System.lineSeparator());
System.out.println("Suma valorilor din array = " + sumOfArray);

}}
