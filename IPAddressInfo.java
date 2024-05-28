
import java.util.Scanner;

public class IPAddressInfo {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an IPv4 address (e.g., 192.168.1.100): ");
String ipAddress = scanner.nextLine();
scanner.close();

String[] octets = ipAddress.split("\\.");

// Determine the class of the IP address
int firstOctet = Integer.parseInt(octets[0]);
if (firstOctet >= 0 && firstOctet <= 127) {

System.out.println("Class A");
System.out.println("Network ID: " + octets[0]);
System.out.println("Host ID: " + octets[1] + "." + octets[2] + "." + octets[3]);
}
else if (firstOctet >= 128 && firstOctet <= 191) {

System.out.println("Class B");
System.out.println("Network ID: " + octets[0] + "." + octets[1]);
System.out.println("Host ID: " + octets[2] + "." + octets[3]);

}
else if (firstOctet >= 192 && firstOctet <= 223) {
System.out.println("Class C");
System.out.println("Network ID: " + octets[0] + "." + octets[1] + "." + octets[2]);
System.out.println("Host ID: " + octets[3]);

}
else if (firstOctet >= 224 && firstOctet <= 239) {
System.out.println("Class D (Multicast)");
System.out.println("Network ID: " + octets[0] + "." + octets[1] + "." + octets[2]+ octets[3]);
System.out.println("Host ID: N/A " );
}
else if (firstOctet >= 240 && firstOctet <= 255) {
System.out.println("Class E (Reserved for future use)");
}

}
}