import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Student", "Student", 336123);
		Pracownik w1 = new Wykladowca("Adam", "Wykladowca", "doktor");
		Pracownik d1 = new Dziekan("Piotr", "Dziekan", "profesor nadzwyczajny");
		Pracownik r1 = new Rektor("Marek", "Rektor", "profesor zwyczajny"); 
		
		s1.idzNaZajecia();
		s1.uczSie();
		s1.grajWLola();
		
		serializujStudenta(s1);
		serializujPracownika(w1);
		serializujPracownika(d1);
		serializujPracownika(r1);
		
	}
	
	static void serializujPracownika(Pracownik p) {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream((p.getClass().getCanonicalName() + "_obj.bin").toLowerCase()))) {
		    outputStream.writeObject(p);
		    System.out.println("Serializuje obiekt klasy " + p.getClass().getCanonicalName()+ " Imie:" + p.getImie() + " Nazwisko:" + p.getNazwisko() + " tytul naukowy:" + p.getTytul_naukowy());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	static void serializujStudenta(Student s) {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream((s.getClass().getCanonicalName() + "_obj.bin").toLowerCase()))) {
		    outputStream.writeObject(s);
		    System.out.println("Serializuje obiekt klasy " + s.getClass().getCanonicalName() + " Imie:" + s.getImie() + " Nazwisko:" + s.getNazwisko() + " numer indeksu:" + s.getNr_indeksu());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
