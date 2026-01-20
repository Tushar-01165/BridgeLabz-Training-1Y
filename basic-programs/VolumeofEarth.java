import java.util.Scanner;
class VolumeofEarth{
	public static void main (String[]args){
		int radiusofEarth = 6378;
		double pi = 3.14;
		double volumeinkm = (4/3) * pi * radiusofEarth * radiusofEarth * radiusofEarth;
		double volumeinmiles = volumeinkm * 0.621;
		System.out.println("The Volume of Earth in cubic kilometers is " + volumeinkm + " and cubic meters is " + volumeinmiles);
	}
}
	