import java.io.Serializable;

public class Rektor extends Pracownik implements Serializable{

	private static final long serialVersionUID = 1L;

	public Rektor(String imie, String nazwisko, String tytul_naukowy) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.tytul_naukowy = tytul_naukowy;
		System.out.println("Konstruktor klasy Rektor");
	}

}
