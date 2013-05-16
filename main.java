import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uebung4 {

	/**
	 * int main(int argc, char **argv) { char name[255];
	 * printf("Enter your name: "); fgets(name, 255, stdin);
	 * printf("length = %d\n", strlen(name)); name[strlen(name)-1] = '\0';
	 * printf("Hello, %s!\n", name); return 0; }
	 */
	public static void main(String[] args) {
		String name = null;

		System.out.println("Enter your name: ");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			name = bufferRead.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("length = " + name.length());
		System.out.println("Hello " + name);
	}

}
