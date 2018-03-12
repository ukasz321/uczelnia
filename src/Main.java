import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("£ukasz", "GwóŸdŸ", 336123);
		Pracownik w1 = new Wykladowca("Imiê", "Nazwisko", "doktor");
		Pracownik d1 = new Dziekan("Imiê", "Nazwisko", "profesor nadzwyczajny");
		Pracownik r1 = new Rektor("Imiê", "Nazwisko", "profesor zwyczajny"); 
		
		s1.idzNaZajecia();
		s1.uczSie();
		s1.grajWLola();
	
		w1.akcja1();
		d1.akcja2();
		r1.akcja3();
		
		//serializacja
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.bin"))) {
		    outputStream.writeObject(s1);
		    outputStream.writeObject(w1);
		    outputStream.writeObject(d1);
		    outputStream.writeObject(r1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
