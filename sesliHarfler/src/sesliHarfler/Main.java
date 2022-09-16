package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'k';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harfler");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harfler");
			break;
			default:
				System.out.println("Sessiz harf girdiniz.Lütfen sesli harf giriniz.");
		}
	}

}
