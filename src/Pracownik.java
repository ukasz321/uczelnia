public class Pracownik {
	
	private String imie;
	private String nazwisko;
	private String tytul_naukowy;
	
	public Pracownik() {
		
	}
	
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
	
	void akcja1(){
		System.out.println("akcja1");
	}
	
	void akcja2(){
		System.out.println("akcja2");
	}
	
	void akcja3(){
		System.out.println("akcja3");
	}
	
}
