import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uebung3 {

	public static void main(String[] args) {

		System.out.println("Enter your firstname : ");

		try {
			BufferedReader bufferRead1 = new BufferedReader(
					new InputStreamReader(System.in));
			String s1 = bufferRead1.readLine();

			System.out.println("Now enter you lastname : ");
			BufferedReader bufferRead2 = new BufferedReader(
					new InputStreamReader(System.in));
			String s2 = bufferRead2.readLine();

			System.out.println("Hello " + s1 + " " + s2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
