package cmd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prompt {

    public static String getResponse(String text) {
        try {
            ArrayList<String> valid = new ArrayList<String>();
            valid.add("s");
            valid.add("n");
            valid.add("q");
            Scanner scanner = new Scanner(System.in);
            System.out.println(text + " [s/n/q]:");
            String answer = scanner.nextLine();
            if (!valid.contains(answer)) {
                System.out.println("Resposta invalida");
                return getResponse(text);
            }
            return answer;
        } catch(Exception e) {
            return getResponse(text);
        }
    }
}
