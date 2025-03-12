import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Erstellt einen zufälligen Großbuchstaben.
     * @return Der zufällige Großbuchstabe.
     * @author Marlon.
     */
    private static String generateRandomCapitalLetter() {
        /* Initialisieren von Random. */
        Random rand = new Random();

        /* Alle möglichen Buchstaben */
        String[] capitalLettersList = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W",
                "X", "Y", "Z"};

        /* Auswahl eines zufälligen Großbuchstabens aus der Liste. */
        String randomCapitalLetter = capitalLettersList[rand.nextInt(capitalLettersList.length)];
        return randomCapitalLetter;
    }

    /**
     * Erstellt einen zufälligen Kleinbuchstaben.
     * @return Der zufällige Kleinbuchstabe.
     * @author Marlon.
     */
    private static String generateRandomLetter() {
        /* Initialisieren von Random. */
        Random rand = new Random();

        /* Alle möglichen Buchstaben */
        String[] lettersList = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};

        /* Auswahl eines zufälligen Großbuchstabens aus der Liste. */
        String randomLetter = lettersList[rand.nextInt(lettersList.length)];
        return randomLetter;
    }

    /**
     * Erstellt ein zufälliges Sonderzeichen.
     * @return Das Sonderzeichen.
     * @author Mohammed.
     */
    private static String generateRandomSpecialCharacter() {
        String[] randomSpecialCharacterArray = {"%","&","'","(",")","*","+",",","-",".","/"};
        int randomCharacterPosition = (int)(Math.random() * 11);

        String randomSpecialCharacter = randomSpecialCharacterArray[randomCharacterPosition];
        return randomSpecialCharacter;
    }

    /**
     * Erstellt eine zufällige Zahl zwischen 0 und 9.
     * @return Die zufällige Zahl.
     * @author Mohammed.
     */
    private static int generateRandomNumber() {
        int numbers = (int)(Math.random() * 10);
        return numbers;
    }

    /**
     * Der Algorithmus, der das Passwort generiert.
     * @param useSpecialCharacters Gibt an, ob Sonderzeichen verwendet werden sollen.
     * @return Das sichere Passwort.
     */
    private static String pwGeneratorAlgorithm(boolean useSpecialCharacters) {
        return null;
    }

    /**
     * Generiert ein sicheres Passwort.
     * @param useSpecialCharacters Gibt an, ob Sonderzeichen verwendet werden sollen.
     * @return Das sichere Passwort.
     */
    private static String[] bulkGeneratePasswords(int amount, boolean useSpecialCharacters) {
        return null;
    }

    /**
     * Überprüft die Stärke des Passworts.
     * @param password Das zu überprüfende Passwort.
     * @return Die Stärke des Passworts. (0 = sehr schwach, 1 = schwach, 2 = mittel, 3 = stark)
     */
    private static int checkPwStrength(String password) {
        return 0;
    }

    /**
     * Exportiert das Passwort in eine Datei.
     * @param path Der Pfad, in dem die Datei gespeichert werden soll.
     * @param fileName Der Name der Datei.
     */
    private static void exportPassword(String path, String fileName) {

    }

    /**
     * Liest die Attribute des Passworts aus einer Datei.
     * @return Die Attribute des Passworts.
     */
    private static String[] readPasswordAttributes() {
        return null;
    }

    /**
     * Gibt die generierten Passwörter in der Konsole aus und
     * zeigt die Passwortstärke an.
     */
    private static void passwordsConsoleOutput() {

    }

    /**
     * Diese Methode ist für Marlon zum Testen von Methoden.
     */
    private static void debug() {
        String randomCapitalLetter = generateRandomCapitalLetter();
        String randomLetter = generateRandomLetter();
        System.out.println(randomCapitalLetter + " " + randomLetter);
    }

    /**
     * Die Main-Methode des Programms.
     * @param args Optionale Argumente.
     */
    public static void main(String[] args) {
        debug(); // Debugging
    }

}