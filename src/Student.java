import java.io.Serializable;

public class Student implements Serializable {
	
	private String imie;
	private String nazwisko;
	private int nr_indeksu;

	public Student(String imie, String nazwisko, int nr_indeksu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_indeksu = nr_indeksu;
		System.out.println("Konstruktor klasy student");
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

	public int getNr_indeksu() {
		return nr_indeksu;
	}

	public void setNr_indeksu(int nr_indeksu) {
		this.nr_indeksu = nr_indeksu;
	}
	
	void idzNaZajecia(){
		System.out.println(imie + " " + nazwisko + " " + "idzie na zajêcia");
	}
	
	void uczSie(){
		System.out.println(imie + " " + nazwisko + " " + "uczy siê");
	}
	
	void grajWLola(){
		System.out.println(imie + " " + nazwisko + " " + "uczy siê");
	}
}
