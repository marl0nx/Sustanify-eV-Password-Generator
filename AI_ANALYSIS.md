# Analyse des Passwortgenerators

Das Programm ist ein komplexer Passwortgenerator in Java, der sichere Passwörter nach bestimmten Regeln erstellt. Ich erkläre dir die Funktionalität im Detail:

## Hauptfunktionalitäten

1. **Zeichengenerierung**: Verschiedene Methoden erzeugen zufällige Groß-/Kleinbuchstaben, Zahlen und Sonderzeichen.
2. **Passwortgenerierung**: Passwörter werden mit definierter Länge und bestimmter Anzahl an Ziffern erstellt.
3. **Passwortstärkebewertung**: Bewertet Passwörter nach Länge und Zeichenvielfalt.
4. **Benutzereingaben**: Verschiedene Einstellungen können vom Benutzer konfiguriert werden.
5. **Dateiexport**: Generierte Passwörter können in Dateien gespeichert werden.

## Detaillierte Funktionsweise

### Zeichengenerierungsmethoden
- `generateRandomCapitalLetter()`: Erzeugt einen zufälligen Großbuchstaben (A-Z).
- `generateRandomLetter()`: Erzeugt einen zufälligen Kleinbuchstaben (a-z).
- `generateRandomSpecialCharacter()`: Erzeugt eines der definierten Sonderzeichen (%, &, ', (, ), *, +, ,, -, ., /).
- `generateRandomNumber()`: Erzeugt eine Zahl zwischen 0-9.
- `chooseBetweenNextCharacterType()`: Wählt abhängig vom Parameter zufällig zwischen den verschiedenen Zeichentypen.

### Passwortgenerierung
- `pwGeneratorAlgorithm()`: Kernstück des Generators. Erzeugt ein Passwort mit folgenden Regeln:
    - Passwörter ≤6 Zeichen: Genau 2 Ziffern
    - Passwörter ≤10 Zeichen: Genau 3 Ziffern
    - Passwörter >10 Zeichen: Genau 4 Ziffern
    - Generiert Passwort zeichenweise und prüft, ob die Ziffernbedingung erfüllt ist

- `bulkGeneratePasswords()`: Erstellt mehrere Passwörter in einem Durchgang.

### Bewertungssystem
- `checkPwStrength()`: Bewertet Passwörter auf einer Skala von 0-3:
    - Länge ≥8: +1 Punkt
    - Länge ≥12: +1 Punkt
    - Zeichenvielfalt (3+ Kategorien): +1 Punkt
    - Bewertung: 0=sehr schwach, 1=schwach, 2=mittel, 3=stark

### Benutzereingaben
- `readAttribute()`: Allgemeine Methode zum Einlesen von Benutzereingaben.
- `readPasswordLength()`: Liest die gewünschte Passwortlänge (4-16 Zeichen).
- `readSpecialCharactersOption()`: Fragt, ob Sonderzeichen verwendet werden sollen.
- `readSaveToFileOption()`: Fragt, ob Passwörter in Datei gespeichert werden sollen.
- `readFilePath()`: Liest den Speicherpfad für die Datei ein.
- `readFileName()`: Liest den Dateinamen ein und prüft auf ungültige Zeichen.
- `readPasswordAmount()`: Liest die Anzahl zu generierender Passwörter ein.
- `readPasswordAttributes()`: Koordiniert die Einlesung aller Einstellungen.

### Ausgabe und Export
- `passwordsConsoleOutput()`: Gibt generierte Passwörter mit Stärkebewertung in der Konsole aus.
- `exportPasswords()`: Speichert Passwörter in einer Datei mit Übersicht der Konfiguration.
- `removeDuplicatedPasswords()`: Prüft auf und markiert doppelte Passwörter.

### Main-Methode
- Liest Benutzereinstellungen ein
- Generiert die gewünschte Anzahl Passwörter
- Entfernt Duplikate
- Zeigt Passwörter in der Konsole an
- Speichert sie optional in einer Datei

## Dateistruktur
Die generierte Datei enthält:
1. Informationen zur Anzahl der generierten Passwörter
2. Die gewählten Einstellungen
3. Die Passwörter selbst

Das Programm kombiniert Sicherheitsanforderungen mit Benutzerfreundlichkeit und bietet eine umfassende Lösung für Passwortgenerierung und -verwaltung.