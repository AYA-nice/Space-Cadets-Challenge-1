//importing the required classes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
//import java.io.FileReader; 
//import java.io.IOException; 

public class EmailID{
	public static void main(String[] args) throws IOException {

	BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	System.out.println("Enter an email id: ");
	String eID = input.readLine();

	String url = "https://www.ecs.soton.ac.uk/people/" + eID;
	URL webAddress = new URL(url);
	BufferedReader in = new BufferedReader(new InputStreamReader(webAddress.openStream()));

	Integer count = 0;
	String nameLine = "";
	while ((count < 14) && ((nameLine = in.readLine()) != null)){
		count++;
	}
	Integer len  = nameLine.length();
	System.out.println(nameLine.substring(nameLine.indexOf("content=")+9, len-4));
}

}