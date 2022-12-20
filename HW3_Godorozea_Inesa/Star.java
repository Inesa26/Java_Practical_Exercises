public class Star
{
	public static void main(String[] args) {
		char[][] array= new char [9][9];

//1 cadran
		for(int i =0; i<=array.length/2;i++){
		    for(int j =0; j<=array.length/2;j++){
		        if((i==j)|| (j==array.length/2)) array[i][j]='*';
		        else array[i][j]=' ';
		      }}
	
//2 cadran
			for(int i =0; i<=array.length/2;i++){
		    for(int j =array.length/2+1; j<array.length; j++){
		        if((i==array.length/2)|| ((i+j)==array.length-1)) array[i][j]='*';
		        else array[i][j]=' ';
		   }}
	
//3 cadran
			for(int i =array.length/2+1; i<array.length;i++){
		    for(int j =array.length/2; j<array.length; j++){
		        if((j==array.length/2)|| (i==j)) array[i][j]='*';
		        else array[i][j]=' ';
		   }}

//4 cadran
			for(int i =array.length/2; i<array.length;i++){
		    for(int j =0; j<array.length/2; j++){
		        if(((i+j)==array.length-1)|| (i==array.length/2)) array[i][j]='*';
		        else array[i][j]=' ';
		   }}	
	
	
//	afisare
	for(int i =0; i<array.length;i++){
		    for(int j =0; j<array.length;j++){
		        System.out.print(array[i][j]+" ");
	
		}System.out.print(System.lineSeparator());}

}}
