public class Pracownik {
	
	protected String imie;
	protected String nazwisko;
	protected String tytul_naukowy;
	
	public Pracownik() {}
	
	//gettery i settery (zabezpieczenie dostępu do zmiennych)
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getTytul_naukowy() {
		return tytul_naukowy;
	}
	public void setTytul_naukowy(String tytul_naukowy) {
		this.tytul_naukowy = tytul_naukowy;
	}
	
	//działania na obiekcie
	public void akcja1(){
		System.out.println("akcja1");
	}
	
	public void akcja2(){
		System.out.println("akcja2");
	}
	
	public void akcja3(){
		System.out.println("akcja3");
	}
	
}
