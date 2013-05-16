import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Uebung6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] stringArr = askname();
		
		System.out.println("Your name : "  + stringArr[0] + " " + stringArr[1]);

	}
	
	public static String[] askname(){
		String fi = null, la = null;
		String[] arr = new String[2];
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your first Name: ");
		
		try {
			
			fi = console.readLine();
			
		}catch (IOException e){ e.printStackTrace(); }
		System.out.println("Now enter your lastname: ");
		try {
			
			la = console.readLine();
		}catch (IOException e){ e.printStackTrace(); }
		arr[0] = fi;
		arr[1] = la;
		return arr;
	}

}
