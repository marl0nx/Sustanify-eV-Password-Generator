package old;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Old20250319 {

    /**
     * Erstellt einen zufälligen Großbuchstaben.
     * @return Der zufällige Großbuchstabe.
     * @author Marlon.
     */
    public static String generateRandomCapitalLetter() {
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
    public static String generateRandomLetter() {
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
    public static String generateRandomSpecialCharacter() {
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
    public static int generateRandomNumber() {
        int numbers = (int)(Math.random() * 10);
        return numbers;
    }

    /**
     * Der Algorithmus, der das Passwort generiert.
     * @param attributes Die Attribute des Passworts.
     * @return Das sichere Passwort.
     */
    public static String pwGeneratorAlgorithm(String[] attributes) {
        int specialCharacter = Boolean.parseBoolean(attributes[1]) ? 1 : 0;
        String capitalLetters;
        String letters;
        String specialCharacters;
        String numbers;
        int passwordLength = (int)(Math.random() * 17);
        String[] password = new String[passwordLength];


        switch (specialCharacter) {
            case 0:                                                                                                      // NoSpecialCharacter
                //______________________________________________________________________________________________________________________________//
                if (passwordLength <= 6) {
                    for (int i = 0; i < passwordLength; i++) {
                        int numberLength = 0;
                        int characterPicker = (int) (Math.random() * 3) + 1;
                        String nextCharacterOrNumber = "";


                        if (characterPicker == 3 && numberLength < 2) {
                            numberLength= numberLength+1;
                            nextCharacterOrNumber = Integer.toString(generateRandomNumber());
                        }


                        else if (characterPicker == 3 && numberLength > 2) {
                            characterPicker = (int) (Math.random() * 2) + 1;
                        }


                        else if (characterPicker == 2) {
                            nextCharacterOrNumber = generateRandomLetter();
                        }


                        else if (characterPicker == 1) {
                            nextCharacterOrNumber = generateRandomCapitalLetter();
                        }


                        password[i] = (nextCharacterOrNumber);
                        String passwordString = "";

                /* for (String character: password) {
                  passwordString += character;
                }
                */
                    }

                }                                                                                                        // End of 6 Character password for loop
                //______________________________________________________________________________________________________________________________//
                if (passwordLength >= 6 && passwordLength <= 10) {
                    for (int i = 0; i < passwordLength; i++) {
                        int numberLength = 0;
                        int characterPicker = (int) (Math.random() * 3) + 1;
                        String nextCharacterOrNumber = "";


                        if (characterPicker == 3 && numberLength < 3) {
                            numberLength= numberLength+1;
                            nextCharacterOrNumber = Integer.toString(generateRandomNumber());
                        }


                        else if (characterPicker == 3 && numberLength > 3) {
                            characterPicker = (int) (Math.random() * 2) + 1;
                        }


                        else if (characterPicker == 2) {
                            nextCharacterOrNumber = generateRandomLetter();
                        }


                        else if (characterPicker == 1) {
                            nextCharacterOrNumber = generateRandomCapitalLetter();
                        }


                        password[i] = (nextCharacterOrNumber);
                        String passwordString = "";

                /* for (String character: password) {
                  passwordString += character;
                }
                */
                    }

                }
                //______________________________________________________________________________________________________________________________//
                if (passwordLength >= 10) {
                    for (int i = 0; i < passwordLength; i++) {
                        int numberLength = 0;
                        int characterPicker = (int) (Math.random() * 3) + 1;
                        String nextCharacterOrNumber = "";


                        if (characterPicker == 3 && numberLength < 4) {
                            numberLength= numberLength+1;
                            nextCharacterOrNumber = Integer.toString(generateRandomNumber());
                        }


                        else if (characterPicker == 3 && numberLength > 4) {
                            characterPicker = (int) (Math.random() * 2) + 1;
                        }


                        else if (characterPicker == 2) {
                            nextCharacterOrNumber = generateRandomLetter();
                        }


                        else if (characterPicker == 1) {
                            nextCharacterOrNumber = generateRandomCapitalLetter();
                        }


                        password[i] = (nextCharacterOrNumber);
                        String passwordString = "";

                /* for (String character: password) {
                  passwordString += character;
                }
                */
                    }

                }
                //______________________________________________________________________________________________________________________________//
                break;
            case 1:
                //______________________________________________________________________________________________________________________________//
                if (passwordLength <= 6) {
                    for (int i = 0; i < passwordLength; i++) {
                        int numberLength = 0;
                        int characterPicker = (int) (Math.random() * 4) + 1;
                        String nextCharacterOrNumber = "";


                        if (characterPicker == 4 && numberLength < 2) {
                            numberLength= numberLength+1;
                            nextCharacterOrNumber = Integer.toString(generateRandomNumber());
                        }


                        else if (characterPicker == 4 && numberLength > 2) {
                            characterPicker = (int) (Math.random() * 2) + 1;
                        }


                        else if (characterPicker == 3) {
                            nextCharacterOrNumber = generateRandomLetter();
                        }


                        else if (characterPicker == 2) {
                            nextCharacterOrNumber = generateRandomCapitalLetter();
                        }

                        else if (characterPicker == 1) {
                            nextCharacterOrNumber = generateRandomSpecialCharacter();
                        }


                        password[i] = (nextCharacterOrNumber);
                        String passwordString = "";

                /* for (String character: password) {
                  passwordString += character;
                }
                */


                    }

                }                                                                                                        // End of 6 Character password for loop
                //______________________________________________________________________________________________________________________________//
                if (passwordLength >= 6 && passwordLength <= 10) {
                    for (int i = 0; i < passwordLength; i++) {
                        int numberLength = 0;
                        int characterPicker = (int) (Math.random() * 4) + 1;
                        String nextCharacterOrNumber = "";


                        if (characterPicker == 4 && numberLength < 3) {
                            numberLength= numberLength+1;
                            nextCharacterOrNumber = Integer.toString(generateRandomNumber());
                        }


                        else if (characterPicker == 4 && numberLength > 3) {
                            characterPicker = (int) (Math.random() * 2) + 1;
                        }


                        else if (characterPicker == 3) {
                            nextCharacterOrNumber = generateRandomLetter();
                        }


                        else if (characterPicker == 2) {
                            nextCharacterOrNumber = generateRandomCapitalLetter();
                        }

                        else if (characterPicker == 1) {
                            nextCharacterOrNumber = generateRandomSpecialCharacter();
                        }


                        password[i] = (nextCharacterOrNumber);
                        String passwordString = "";

                /* for (String character: password) {
                  passwordString += character;
                }
                */


                    }

                }
                //______________________________________________________________________________________________________________________________//
                if (passwordLength >= 10) {
                    for (int i = 0; i < passwordLength; i++) {
                        int numberLength = 0;
                        int characterPicker = (int) (Math.random() * 4) + 1;
                        String nextCharacterOrNumber = "";


                        if (characterPicker == 4 && numberLength < 2) {
                            numberLength= numberLength+1;
                            nextCharacterOrNumber = Integer.toString(generateRandomNumber());
                        }


                        else if (characterPicker == 4 && numberLength > 4) {
                            characterPicker = (int) (Math.random() * 4) + 1;
                        }


                        else if (characterPicker == 3) {
                            nextCharacterOrNumber = generateRandomLetter();
                        }


                        else if (characterPicker == 2) {
                            nextCharacterOrNumber = generateRandomCapitalLetter();
                        }

                        else if (characterPicker == 1) {
                            nextCharacterOrNumber = generateRandomSpecialCharacter();
                        }


                        password[i] = (nextCharacterOrNumber);
                        String passwordString = "";

                /* for (String character: password) {
                  passwordString += character;
                }
                */


                    }

                }
                //______________________________________________________________________________________________________________________________//
                break;
        }
        return null;
    }

    /**
     * Generiert ein sicheres Passwort.
     * @param useSpecialCharacters Gibt an, ob Sonderzeichen verwendet werden sollen.
     * @return Das sichere Passwort.
     */
    public static String[] bulkGeneratePasswords(int amount, boolean useSpecialCharacters) {

        String[] passwords = new String[16];
        String passwort;

        return null;
    }

    /**
     * Überprüft die Stärke des Passworts.
     * @param password Das zu überprüfende Passwort.
     * @return Die Stärke des Passworts. (0 = sehr schwach, 1 = schwach, 2 = mittel, 3 = stark)
     */
    public static int checkPwStrength(String password) {
        if (password.length() < 6) {
            return 0; // sehr schwach
        } else if (password.length() < 8) {
            return 1; // schwach
        } else if (password.length() < 10) {
            return 2; // mittel
        } else {
            return 3; // stark
        }
        // Überprüfen, ob das Passwort die Anforderungen erfüllt

    }

    /**
     * Exportiert das Passwort in eine Datei.
     * @param path Der Pfad, in dem die Datei gespeichert werden soll.
     * @param fileName Der Name der Datei.
     */
    public static void exportPassword(String path, String fileName, String password) throws IOException, RuntimeException {
        FileWriter writer;
        if (path.isEmpty()) {
            writer = new FileWriter(fileName);
        } else {
            writer = new FileWriter(path + "/" + fileName);
        }

        writer.write(password);
        writer.close(); // Wichtig! Writer immer schließen!
        System.out.println("Password exportiert!");
    }

    /**
     * Liest die Attribute des Passworts aus einer Datei.
     * 0: Länge des Passworts
     * 1: Sonderzeichen (ja/nein | Standard: ja)
     * 2: Passwort in Datei speichern (ja/nein | Standard: nein)
     * 3: Dateipfad
     * 4: Dateiname
     * @return Die Attribute des Passworts.
     */
    public static String[] readPasswordAttributes(){
        /* Initialisieren von Scanner. */
        Scanner scanner = new Scanner(System.in);

        /* Erstellen eines Arrays für die Attribute. */
        String[] arguments = new String[5];

        /* Einlesen der Passwortlänge. */
        boolean isPasswordSet = false;
        while (isPasswordSet == false) {
            System.out.println("Länge des Passworts: ");
            arguments[0] = scanner.nextLine();

            /*
             * Wenn die Länge des Passworts nicht zwischen 4 und 16 Zeichen liegt,
             * wird das Programm beendet.
             */
            if (Integer.parseInt(arguments[0]) < 4 || Integer.parseInt(arguments[0]) > 16) {
                System.out.println("Die Länge des Passworts muss zwischen 4 und 16 Zeichen liegen.");
                continue;
            }

            /* Wenn die Länge des Passworts zwischen 4 und 16 Zeichen liegt, wird isPasswordSet auf true gesetzt. */
            isPasswordSet = true;
        }

        /* Einlesen, ob Sonderzeichen verwendet werden sollen. */
        System.out.println("Sonderzeichen (ja/nein | Standard: ja): ");
        arguments[1] = scanner.nextLine();

        /* Überprüfen, ob der Benutzer ja oder nein eingegeben hat. (Standard: ja) */
        switch (arguments[1]) {
            case "ja":
                arguments[1] = "true";
                break;
            case "nein":
                arguments[1] = "false";
                break;
            default:
                System.out.println("Ungültige Eingabe: Es werden nur Sonderzeichen verwendet.");
                arguments[1] = "true"; // Standard: ja
        }

        /* Einlesen, ob die Passwörter in einer Datei gespeichert werden sollen. (Standard: nein) */
        System.out.println("Möchten Sie die Passwörter in einer Datei speichern? (ja/nein | Standard: nein): ");
        arguments[2] = scanner.nextLine();

        /*
         * Wenn der Benutzer die Passwörter in einer Datei speichern möchte,
         * wird der Dateipfad und der Dateiname eingelesen.
         */
        switch (arguments[2]) {
            case "ja":

                /* Passwort in der Datei speichern wird auf true gesetzt. */
                arguments[2] = "true";

                /* Einlesen des Dateipfades. */
                boolean isFilePathSet = false;
                while (isFilePathSet == false) {
                    System.out.println("Bitte geben Sie den Dateipfad an:");
                    arguments[3] = scanner.nextLine();

                    /* Überprüfen, ob der Dateipfad existiert. */
                    File f = new File (arguments[3]);
                    if (!f.exists() || !f.isDirectory()) {
                        System.out.println("Dateipfad existiert nicht oder ist kein Verzeichnis.");
                        continue;
                    }

                    isFilePathSet = true;
                }

                /* Einlesen des Dateinamens. */
                boolean isFileNameSet = false;

                while (isFileNameSet == false) {
                    String[] forbiddenCharacters = {"\\", "/", ":", "*", "?", "\"", "<", ">", "|"};
                    System.out.println("Name der Datei: ");
                    arguments[4] = scanner.nextLine();

                    /* Überprüfen, ob der Dateiname verbotene Sonderzeichen enthält. */
                    boolean containsForbiddenCharacter = false;
                    for (String character: forbiddenCharacters) {
                        if (arguments[4].contains(character)) {
                            System.out.println("Der Dateiname darf keine der folgenden Zeichen enthalten: \\ / : * ? \" < > |");
                            containsForbiddenCharacter = true;
                        }
                    }
                    if (containsForbiddenCharacter) {
                        continue;
                    }

                    /* Überprüfen, ob die Datei existiert. */
                    File f = new File (arguments[3] + "\\" + arguments[4]);
                    if (f.exists()) {
                        System.out.println("Datei existiert bereits.");
                        continue;
                    }

                    /* isFileNameSet wird auf true gesetzt. */
                    isFileNameSet = true;
                }
                break;
            case "nein":

                /* Passwort in der Datei speichern wird auf false gesetzt. */
                arguments[2] = "false";
                break;
            default:
                System.out.println("Ungültige Eingabe: Die Passwörter werden nicht in einer Datei gespeichert.");
                arguments[2] = "false"; // Standard: nein
        }

        return arguments;
    }

    /**
     * Gibt die generierten Passwörter in der Konsole aus und
     * zeigt die Passwortstärke an.
     */
    public static void passwordsConsoleOutput() {

    }

    /**
     * Diese Methode ist für Marlon zum Testen von Methoden.
     */
    public static void debug() throws IOException {
        exportPassword("", "password.txt", "meinPassword");
    }

    /**
     * Die Main-Methode des Programms.
     * @param args Optionale Argumente.
     */
    public static void main(String[] args) throws IOException {
        debug();
    }}
