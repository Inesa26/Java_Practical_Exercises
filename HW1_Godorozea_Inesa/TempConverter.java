public class TempConverter{
	public static void main (String[] args){
double celsius =20;
double fahrenheit =75.55;
double celToFahr=((celsius*9)/5)+32;
double fahrToCel=((fahrenheit-32)*5)/9;

System.out.println(celsius+ " C = "+celToFahr+" F");
System.out.println(fahrenheit+ " F = "+fahrToCel+" C");
}
}
