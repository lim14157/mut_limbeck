import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Uebung2 {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		String name = null;
		
		System.out.println("Enter your name: ");
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			name = console.readLine();
		}catch (IOException e){ e.printStackTrace(); }
		
		System.out.println("Length " + name.length() + "\n");
		System.out.println("Hallo " + name);
		

	}
}
