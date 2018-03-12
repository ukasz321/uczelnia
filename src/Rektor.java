import java.io.Serializable;

public class Rektor extends Pracownik implements Serializable{

	private static final long serialVersionUID = 1L;

	public Rektor(String imie, String nazwisko, String tytul_naukowy) {
		imie = getImie();
		nazwisko = getNazwisko();
		tytul_naukowy = getTytul_naukowy();	
		System.out.println("Konstruktor klasy rektor");
	}
	

}
