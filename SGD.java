import java.util.Scanner;

public class SGD {

	public static void main(String[] args) {
		int mat, fizik, kimya, muzik, turkce, total = 0, point = 0;

		Scanner inp = new Scanner(System.in);
		System.out.println("Mat Notunuzu Giriniz: ");
		mat = inp.nextInt();
		if (mat > 0 && mat <= 100) {
			total = total + mat;
			point++;
		}

		System.out.println("Fizik Notunuzu Giriniz: ");
		fizik = inp.nextInt();
		if (fizik > 0 && fizik <= 100) {
			total = total + fizik;
			point++;
		}

		System.out.println("Kimya Notunuzu Giriniz: ");
		kimya = inp.nextInt();
		if (kimya > 0 && kimya <= 100) {
			total = total + kimya;
			point++;
		}

		System.out.println("M�zik Notunuzu Giriniz: ");
		muzik = inp.nextInt();
		if (muzik > 0 && muzik <= 100) {
			total = total + muzik;
			point++;
		}

		System.out.println("T�rk�e Notunuzu Giriniz: ");
		turkce = inp.nextInt();
		if (turkce > 0 && turkce <= 100) {
			total = total + turkce;
			point++;
		}

		double avarege = total/point;
		if (avarege <= 55) {
			System.out.println("S�n�f� Ge�emediniz");
			System.out.println("Ortalaman�z: " + avarege);
		} else {
			System.out.println("Tebrikler S�n�f Ge�tiniz");

		}
		System.out.println("Ortalaman�z: " + avarege);
	}

}
