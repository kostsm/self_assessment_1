package self_assessment;

public class task1 {
	public static void main(String[] args) {
		double sunRadius = 865000.0 / 2;
		double earthRadius = 7600.0 / 2;

		double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
		double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
		double volumesRatio = sunVolume / earthVolume;
        
		System.out.printf("The volume of the Earth is %.3f cubic miles\n", earthVolume);
		System.out.printf("The volume of the Sun is %.3f cubic miles\n", sunVolume);
		System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumesRatio);
	}
}
