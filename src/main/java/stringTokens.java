import java.io.*;
import java.util.*;

public class stringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        // String vazia
        if (s.isEmpty() || !s.matches(".*[A-Za-z].*")) {
            System.out.println(0);
            scan.close();
            return;
        }

        // Divide por caracteres nao alfabeticos
        String[] tokens = s.split("[^A-Za-z]+");

        // Filtra tokens vazios
        List<String> validTokens = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                validTokens.add(token);
            }
        }

        // Imprime resultado
        System.out.println(validTokens.size());
        for (String token : validTokens) {
            System.out.println(token);
        }

        scan.close();
    }
}