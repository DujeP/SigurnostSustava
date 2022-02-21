package CeazerMethod;

import java.util.Scanner;

/**
 * @author Duje Popovic
 *
 */
public class Pokus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki tekst: ");
        String unos = sc.nextLine();
        System.out.println("Za koliko mijesta zelite da se pomaknu slova: ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < unos.length();i++) 
        {
             // jedan po jedan
            alphabet = unos.charAt(i);
            
            // ako je izmedu A i Z
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift
             alphabet = (char) (alphabet + shift);
             // ako je shift veci od Z
             if(alphabet > 'z') {
                // vrati na pocetak
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // ako je izmedu A i Z
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift 
             alphabet = (char) (alphabet + shift);    
                
             // ako je shift veci od Z
             if(alphabet > 'Z') {
                 //vrati na pocetak
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println("Kriptriran tekst: " + ciphertext);
	}

}
