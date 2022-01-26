package cmd;

import java.util.ArrayList;
import java.util.Scanner;

public class Prompt {

    public static String getResponse(String text) {
        try {
            ArrayList<String> valid = new ArrayList<String>();
            valid.add("s");
            valid.add("n");
            valid.add("q");
            Scanner scanner = new Scanner(System.in);
            System.out.println("O animal que você pensou " + text + " [s/n/q]:");
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

    public static ArrayList<String> newAnimal(String previousAnimal) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Que animal você pensou?");
            String animal = scanner.nextLine();
            System.out.println("O/A " + animal + " __________ mas o/a " + previousAnimal + " não");
            String clue = scanner.nextLine();
            ArrayList<String> clueAndAnimalPair = new ArrayList<>();
            clueAndAnimalPair.add(clue);
            clueAndAnimalPair.add(animal);
            return clueAndAnimalPair;
        } catch(Exception e) {
            return newAnimal(previousAnimal);
        }
    }
}
