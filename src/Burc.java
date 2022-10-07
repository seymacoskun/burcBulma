import java.util.Scanner;

public class Burc {
	public static void main(String[] args) {
		int ay, gun;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kacinci ayda dogdunuz? : ");
		ay = inp.nextInt();
		System.out.println("Ayin kacinci gunu dogdunuz? : ");
		gun = inp.nextInt();
		
		if((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
			System.out.println("Kova burcusunuz.");
		}else if((ay == 2) || (ay == 3 && gun <= 20)) {
			System.out.println("Balik burcusunuz.");
		}else if((ay == 3) || (ay == 4 && gun <= 20)) {
			System.out.println("Koc burcusunuz.");
		}else if((ay == 4) || (ay == 5 && gun <= 21)) {
			System.out.println("Boga burcusunuz.");
		}else if((ay == 5) || (ay == 6 && gun <= 22)) {
			System.out.println("Ikizler burcusunuz.");
		}else if((ay == 6) || (ay == 7 && gun <= 22)) {
			System.out.println("Yengec burcusunuz.");
		}else if((ay == 7) || (ay == 8 && gun <= 22)) {
			System.out.println("Aslan burcusunuz.");
		}else if((ay == 8) || (ay == 9 && gun <= 22)) {
			System.out.println("Basak burcusunuz.");
		}else if((ay == 9) || (ay == 10 && gun <= 22)) {
			System.out.println("Terazi burcusunuz.");
		}else if((ay == 10) || (ay == 11 && gun <= 22)) {
			System.out.println("Akrep burcusunuz.");
		}else if((ay == 11) || (ay == 12 && gun <= 21)) {
			System.out.println("Yay burcusunuz.");
		}else {
			System.out.println("Oglak burcusunuz.");
		}
	}

}
