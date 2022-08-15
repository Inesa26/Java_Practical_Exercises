 public class TempConverter{
	public void convertToFahr(double celsius){
		double celToFahr = ((celsius*9)/5)+32;
		System.out.println ("100 °C = " + celToFahr +" °F");

	}

	public void convertToCelsius(double fahr){
		double fahrToCel = ((fahr-32)*5)/9;
		System.out.println ("100 °C = " + fahrToCel  +" °F");
	}
}
