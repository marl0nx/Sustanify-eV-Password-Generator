import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Erstellt einen zufälligen Großbuchstaben.
     *
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
        return capitalLettersList[rand.nextInt(capitalLettersList.length)];
    }

    /**
     * Erstellt einen zufälligen Kleinbuchstaben.
     *
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
        return lettersList[rand.nextInt(lettersList.length)];
    }

    /**
     * Erstellt ein zufälliges Sonderzeichen.
     *
     * @return Das Sonderzeichen.
     * @author Mohammed.
     */
    public static String generateRandomSpecialCharacter() {
        /* Initialisieren von Random. */
        Random rand = new Random();
        String[] randomSpecialCharacterArray = {"%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/"};

        return randomSpecialCharacterArray[rand.nextInt(randomSpecialCharacterArray.length)];
    }

    /**
     * Erstellt eine zufällige Zahl zwischen 0 und 9.
     *
     * @return Die zufällige Zahl.
     * @author Mohammed.
     */
    public static int generateRandomNumber() {
        /* Initialisieren von Random. */
        Random rand = new Random();

        /* Auswahl einer zufälligen Zahl zwischen 0 und 9. */
        return rand.nextInt(10);
    }

    /**
     * Wählt zufällig zwischen Großbuchstaben, Kleinbuchstaben, Sonderzeichen und Zahlen aus.
     *
     * @param useSpecialCharacters Gibt an, ob Sonderzeichen verwendet werden sollen.
     * @return Der zufällige Buchstabe, das zufällige Sonderzeichen oder die zufällige Zahl.
     * @author Marlon.
     */
    public static String chooseBetweenNextCharacterType(boolean useSpecialCharacters) {
        /* Initialisieren von Random. */
        Random rand = new Random();
        int random = rand.nextInt(4);

        if (useSpecialCharacters) { // Wenn Sonderzeichen verwendet werden sollen
            switch (random) {
                case 0:
                    return generateRandomCapitalLetter();
                case 1:
                    return generateRandomLetter();
                case 2:
                    return generateRandomSpecialCharacter();
                case 3:
                    return Integer.toString(generateRandomNumber());
            }
        } else { // Wenn keine Sonderzeichen verwendet werden sollen
            switch (random) {
                case 0:
                    return generateRandomCapitalLetter();
                case 1:
                    return generateRandomLetter();
                default: // Wenn etwas Höheres als 1 zurückgegeben wird, wird eine Zahl zurückgegeben.
                    return Integer.toString(generateRandomNumber());
            }
        }
        return null;
    }

    public static String readAttribute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        return scanner.nextLine();
    }

    /**
     * Der Algorithmus, der das Passwort generiert.
     *
     * @param attributes Die Attribute des Passworts.
     * @return Das sichere Passwort.
     * @author Mohammed + Marlon.
     */
    public static String pwGeneratorAlgorithm(String[] attributes) {
        int passwordLength = Integer.parseInt(attributes[0]);
        boolean useSpecialCharacters = Boolean.parseBoolean(attributes[1]);

        String password = ""; // Das Passwort, welches nach und nach generiert wird.
        int digitsUsed = 0; // Die Anzahl der Ziffern, die bereits in das Passwort eingebaut wurden.

        if (passwordLength <= 6) { // Passwort mit genau 2 Ziffern
            while (password.length() < passwordLength) {
                String nextCharacter = chooseBetweenNextCharacterType(useSpecialCharacters);

                /* Wenn es eine Ziffer ist und wir noch nicht 2 Ziffern haben */
                if (Character.isDigit(nextCharacter.charAt(0)) && digitsUsed < 2) {
                    password += nextCharacter;
                    digitsUsed++;
                }

                /* Wenn es keine Ziffer ist */
                else if (!Character.isDigit(nextCharacter.charAt(0))) {
                    password += nextCharacter;
                }

                /* Wenn das Passwort die Länge erreicht hat und nicht genau 2 Ziffern verwendet wurden */
                if (password.length() == passwordLength && digitsUsed != 2) {
                    /* Passwort zurücksetzen und neu beginnen */
                    password = "";
                    digitsUsed = 0;
                }
            }
        } else if (passwordLength <= 10) { // Passwort mit genau 3 Ziffern
            while (password.length() < passwordLength) {
                String nextCharacter = chooseBetweenNextCharacterType(useSpecialCharacters);

                /* Wenn es eine Ziffer ist und wir noch nicht 3 Ziffern haben */
                if (Character.isDigit(nextCharacter.charAt(0)) && digitsUsed < 3) {
                    password += nextCharacter;
                    digitsUsed++;
                }
                /* Wenn es keine Ziffer ist */
                else if (!Character.isDigit(nextCharacter.charAt(0))) {
                    password += nextCharacter;
                }

                /* Wenn das Passwort die Länge erreicht hat und nicht genau 3 Ziffern verwendet wurden */
                if (password.length() == passwordLength && digitsUsed != 3) {
                    /* Passwort zurücksetzen und neu beginnen */
                    password = "";
                    digitsUsed = 0;
                }
            }
        } else { // Passwort mit genau 4 Ziffern
            while (password.length() < passwordLength) {
                String nextCharacter = chooseBetweenNextCharacterType(useSpecialCharacters);

                /* Wenn es eine Ziffer ist und wir noch nicht 4 Ziffern haben */
                if (Character.isDigit(nextCharacter.charAt(0)) && digitsUsed < 4) {
                    password += nextCharacter;
                    digitsUsed++;
                }
                /* Wenn es keine Ziffer ist */
                else if (!Character.isDigit(nextCharacter.charAt(0))) {
                    password += nextCharacter;
                }

                /* Wenn das Passwort die Länge erreicht hat und nicht genau 4 Ziffern verwendet wurden */
                if (password.length() == passwordLength && digitsUsed != 4) {
                    /* Passwort zurücksetzen und neu beginnen */
                    password = "";
                    digitsUsed = 0;
                }
            }
        }

        return password;
    }

    /**
     * Erschafft eine Menge von sicheren Passwörtern mithilfe der bereits definierten Methoden.
     *
     * @param arguments Die Attribute des Passworts.
     * @return Das sichere Passwort.
     * @author Marlon.
     */
    public static String[] bulkGeneratePasswords(String[] arguments) {
        String[] passwords = new String[Integer.parseInt(arguments[5])];
        for (int i = 0; i < Integer.parseInt(arguments[5]); i++) {
            passwords[i] = pwGeneratorAlgorithm(arguments);
        }
        return passwords;
    }

    /**
     * Überprüft die Stärke des Passworts basierend auf Länge und Zeichenvielfalt.
     *
     * @param password Das zu überprüfende Passwort.
     * @return Die Stärke des Passworts: 0 = schwach, 1 = mittel, 2 = gut, 3 = stark
     * @author Marlon + KI.
     */
    public static int checkPwStrength(String password) {
        /* Initialer Score */
        int score = 0;

        /* Prüfung auf leeres Passwort */
        if (password == null || password.isEmpty()) {
            return 0; // Sehr schwach
        }

        /* Bewertung der Passwortlänge */
        if (password.length() >= 8) {
            score += 1; // Schwach
        }

        if (password.length() >= 12) {
            score += 1; // Mittel
        }

        /* Überprüfung der Zeichenvielfalt */
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        /* Prüfung jedes Zeichens im Passwort */
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        /* Berechnung der Zeichenvielfalt */
        int variety = 0;
        if (hasLower) {
            variety++;
        }

        if (hasUpper) {
            variety++;
        }

        if (hasDigit) {
            variety++;
        }

        if (hasSpecial) {
            variety++;
        }

        /* Bewertung basierend auf der Zeichenvielfalt */
        if (variety >= 3) {
            score += 1; // Stark
        }

        /* Rückgabe der Passwort-Stärke */
        return score;
    }


    /**
     * Exportiert das Passwort in eine Datei.
     * @param path     Der Pfad, in dem die Datei gespeichert werden soll.
     * @param fileName Der Name der Datei.
     * @param passwords Die Passwörter, die exportiert werden sollen.
     * @author Hend + Marlon.
     */
    public static void exportPasswords(String path, String fileName, String[] passwords, String[] arguments) throws IOException, RuntimeException {
        /* Initialisieren von FileWriter. */
        FileWriter writer;

        /* Wenn der Pfad leer ist, wird die Datei im aktuellen Verzeichnis gespeichert. */
        if (path.isEmpty()) {
            writer = new FileWriter(fileName);
        } else {
            writer = new FileWriter(path + "/" + fileName);
        }

        /* Header der Datei erstellen */
        String header = """
                Es wurden insgesamt %AMOUNT% Passwörter generiert.
                
                Du hast folgende Einstellungen getroffen:
                - Passwortlänge: %PW_LENGTH%
                - Sonderzeichen: %SPECIAL_CHARACTERS%
                - Passwörter in Datei speichern: true
                - Dateipfad: %PATH%
                - Dateiname: %FILENAME%
                _________________________
                """;

        /* Platzhalter ersetzen */
        header = header
                .replace("%AMOUNT%", Integer.toString(passwords.length))
                .replace("%PW_LENGTH%", arguments[0])
                .replace("%SPECIAL_CHARACTERS%", arguments[1])
                .replace("%FILENAME%", fileName);

        /* Wenn der Pfad leer ist, wird "Aktuelles Verzeichnis" angezeigt. */
        if (path.isEmpty()) {
            header = header.replace("%PATH%", "Aktuelles Verzeichnis");
        } else {
            header = header.replace("%PATH%", path);
        }

        /* Header in die Datei schreiben. */
        writer.write(header + "\n");

        /* Alle Passwörter in die Datei schreiben. */
        for (String password : passwords) {
            writer.write(password + "\n");
        }
        writer.close();
        System.out.println("\033[32mIhre Passwörter wurde erfolgreich gespeichert!\033[0m");
    }

    /**
     * Liest die Passwortlänge vom Benutzer ein.
     * @return Die eingelesene Passwortlänge als String.
     * @author Marlon.
     */
    public static String readPasswordLength() {
        boolean isPasswordSet = false;
        String passwordLength = "";

        while (!isPasswordSet) {
            System.out.println("\033[33mLänge des Passworts:\033[0m ");
            passwordLength = readAttribute();

            /* Überprüfen, ob der Benutzer eine Zahl eingegeben hat. */
            if (!Character.isDigit(passwordLength.charAt(0))) {
                System.out.println("\033[31mDie eingegebene Länge ist keine Zahl.\033[0m");
                continue;
            }

            /* Wenn die Länge des Passworts nicht zwischen 4 und 16 Zeichen liegt. */
            if (Integer.parseInt(passwordLength) < 4 || Integer.parseInt(passwordLength) > 16) {
                System.out.println("\033[31mDie Länge des Passworts muss zwischen 4 und 16 Zeichen liegen.\033[0m");
                continue;
            }

            isPasswordSet = true;
        }

        return passwordLength;
    }

    /**
     * Liest ein, ob Sonderzeichen verwendet werden sollen.
     * @return "true" wenn Sonderzeichen verwendet werden sollen, sonst "false".
     * @author Marlon.
     */
    public static String readSpecialCharactersOption() {
        System.out.println("\033[33mSonderzeichen (ja/nein | Standard: ja): \033[0m");
        String option = readAttribute();

        switch (option) {
            case "ja":
                return "true";
            case "nein":
                return "false";
            default:
                System.out.println("\033[31mUngültige Eingabe: Es werden nur Sonderzeichen verwendet.\033[0m");
                return "true"; // Standard: ja
        }
    }

    /**
     * Liest ein, ob Passwörter in eine Datei gespeichert werden sollen.
     * @return "true" wenn Passwörter gespeichert werden sollen, sonst "false".
     * @author Marlon.
     */
    public static String readSaveToFileOption() {
        System.out.println("\033[33mMöchten Sie die Passwörter in einer Datei speichern? (ja/nein | Standard: nein): \033[0m");
        String option = readAttribute();

        switch (option) {
            case "ja":
                return "true";
            case "nein":
                return "false";
            default:
                System.out.println("\033[31mUngültige Eingabe: Die Passwörter werden nicht in einer Datei gespeichert.\033[0m");
                return "false"; // Standard: nein
        }
    }

    /**
     * Liest den Dateipfad ein.
     * @return Der eingelesene Dateipfad.
     * @author Marlon.
     */
    public static String readFilePath() {
        boolean isFilePathSet = false;
        String filePath = "";

        while (!isFilePathSet) {
            System.out.println("\033[33mBitte geben Sie den Dateipfad an:\033[0m ");
            filePath = readAttribute();

            /* Überprüfen, ob der Dateipfad existiert. */
            File f = new File(filePath);
            if (filePath.isEmpty()) {
                System.out.println("\033[32mDie Datei wird im aktuellen Verzeichnis gespeichert.\033[0m");
            } else if (!f.exists() || !f.isDirectory()) {
                System.out.println("\033[31mDateipfad existiert nicht oder ist kein Verzeichnis.\033[0m");
                continue;
            }

            isFilePathSet = true;
        }

        return filePath;
    }

    /**
     * Liest den Dateinamen ein.
     * @param filePath Der Dateipfad, in dem die Datei gespeichert werden soll.
     * @return Der eingelesene Dateiname.
     * @author Marlon.
     */
    public static String readFileName(String filePath) {
        boolean isFileNameSet = false;
        String fileName = "";

        while (!isFileNameSet) {
            String[] forbiddenCharacters = {"\\", "/", ":", "*", "?", "\"", "<", ">", "|"};
            System.out.println("\033[33mName der Datei: \033[0m");
            fileName = readAttribute();

            /* Überprüfen, ob der Dateiname verbotene Sonderzeichen enthält. */
            boolean containsForbiddenCharacter = false;
            for (String character : forbiddenCharacters) {
                if (fileName.contains(character)) {
                    System.out.println("\033[31mDer Dateiname darf keine der folgenden Zeichen enthalten: \\ / : * ? \" < > |\033[0m");
                    containsForbiddenCharacter = true;
                }
            }
            if (containsForbiddenCharacter) {
                continue;
            }

            /* Überprüfen, ob die Datei bereits existiert. */
            File f = new File(filePath + "\\" + fileName);
            if (f.exists()) {
                System.out.println("\033[32mDatei existiert bereits.\033[0m");
                continue;
            }

            isFileNameSet = true;
        }

        return fileName;
    }

    /**
     * Liest die Anzahl der Passwörter ein.
     * @return Die eingelesene Anzahl der Passwörter als Integer.
     * @author Marlon.
     */
    public static int readPasswordAmount() {
        boolean isPasswordAmountSet = false;
        int passwordAmount = 0;

        while (!isPasswordAmountSet) {
            System.out.println("\033[33mAnzahl der Passwörter: \033[0m");
            String passwordAmountString = readAttribute();

            /* Überprüfen, ob der Benutzer eine Zahl eingegeben hat. */
            if (!Character.isDigit(passwordAmountString.charAt(0)) || passwordAmountString.isBlank()) {
                System.out.println("\033[31mDie eingegebene Anzahl ist keine Zahl.\033[0m");
                continue;
            }

            passwordAmount = Integer.parseInt(passwordAmountString);
            isPasswordAmountSet = true;
        }

        return passwordAmount;
    }

    /**
     * Liest die Attribute des Passworts vom Benutzer ein.
     * 0: Länge des Passworts
     * 1: Sonderzeichen (ja/nein | Standard: ja)
     * 2: Passwort in Datei speichern (ja/nein | Standard: nein)
     * 3: Dateipfad
     * 4: Dateiname
     * @return Die Attribute des Passworts.
     * @author Hend + Marlon.
     */
    public static String[] readPasswordAttributes() {
        /* Erstellen eines Arrays für die Attribute. */
        String[] arguments = new String[6];

        /* Einlesen der Passwortlänge. */
        arguments[0] = readPasswordLength();

        /* Einlesen, ob Sonderzeichen verwendet werden sollen. */
        arguments[1] = readSpecialCharactersOption();

        /* Einlesen, ob die Passwörter in einer Datei gespeichert werden sollen. */
        arguments[2] = readSaveToFileOption();

        /* Wenn der Benutzer die Passwörter in einer Datei speichern möchte. */
        if (arguments[2].equals("true")) {
            /* Einlesen des Dateipfades. */
            arguments[3] = readFilePath();

            /* Einlesen des Dateinamens. */
            arguments[4] = readFileName(arguments[3]);
        }

        /* Einlesen der Anzahl der Passwörter. */
        arguments[5] = Integer.toString(readPasswordAmount());

        return arguments;
    }

    /**
     * Gibt die generierten Passwörter in der Konsole aus und
     * zeigt die Passwortstärke an.
     * @author Mohammed.
     */
    public static void passwordsConsoleOutput(String[] passwords) {
        int passwordStrength;

        if (passwords.length > 500) {
            System.out.println("\033[31mEs wurden mehr als 500 Passwörter generiert. Die Passwörter werden dementsprechend nicht in der Konsole angezeigt.\033[0m");
            System.out.println("\033[31mEs wird empfohlen, bei so einer großen Menge diese in einer Datei zu speichern.\033[0m");
            return;
        }

        for (int i = 0; i < passwords.length; i++) {
            passwordStrength = checkPwStrength(passwords[i]);
            System.out.println("\n\033[33mPasswort " + (i + 1) + ": \033[34m" + passwords[i]);
            System.out.println("\033[33mPasswortstärke: \033[34m" + passwordStrength);
        }

        System.out.println("""
                \n\033[35mPasswortstärken Legende:
                0 = sehr schwach
                1 = schwach
                2 = mittel
                3 = stark
                """);
    }

    /**
     * Entfernt Duplikate aus der Liste der generierten Passwörter.
     * @param passwords Die Liste der generierten Passwörter.
     * @author Marlon
     */
    public static String[] removeDuplicatedPasswords(String[] passwords) {
        boolean foundDuplicate = false;

        for (int i = 0; i < passwords.length; i++) { // Erstes Passwort
            for (int j = i + 1; j < passwords.length; j++) { // Zu vergleichendes Passwort
                if (passwords[i].equals(passwords[j]) && !passwords[i].equals("Duplikat")) {
                    foundDuplicate = true;
                    passwords[j] = "Duplikat"; // Doppeltes Passwort zu "Duplikat" umbenennen.
                }
            }
        }

        if (foundDuplicate) {
            System.out.println("\033[31mEs wurden Duplikate gefunden. Diese wurden durch \"Duplikat \" ersetzt.\033[0m");
            System.out.println("\033[31mBitte erhöhen Sie die Länge der Passwörter oder reduzieren Sie die Menge.\033[0m");
        }

        return passwords;
    }

    /**
     * Die Main-Methode des Programms.
     *
     * @param args Optionale Argumente.
     */
    public static void main(String[] args) throws IOException {
        String[] arguments = readPasswordAttributes();
        String[] passwords = bulkGeneratePasswords(arguments);
        passwords = removeDuplicatedPasswords(passwords);
        passwordsConsoleOutput(passwords);

        /* Wenn der Benutzer die Passwörter in einer Datei speichern möchte. */
        if (arguments[2].equals("true")) {
            exportPasswords(arguments[3], arguments[4], passwords, arguments);
        }
    }
}
