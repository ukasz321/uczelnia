import java.io.Serializable;

public class Dziekan extends Pracownik implements Serializable{

	private static final long serialVersionUID = 1L;

	public Dziekan(String imie, String nazwisko, String tytul_naukowy) {
		imie = getImie();
		nazwisko = getNazwisko();
		tytul_naukowy = getTytul_naukowy();
		System.out.println("Konstruktor klasy dziekan");
	}

}
