# trinat Projekt Moorhuhn

Mitglieder: Lucien Gschwind, Robert Wiesler, Michael Buchbauer

## Inhaltsverzeichnis:

1. [Einleitung]()

2. [Ziele]()

3. [Randbedingungen]()

4. [Bedienungsanleitung]()

5. [Build Anleitung]() 

6. [User Stories in Tabellenform]()

7. [Releaseplan mit den Ausbaustufen]()

8. [Dokumentation Sprint 1]()
- [Taskliste der User Stories (mit Schätzung)]()
- [Anreicherung der User Stories]()
- [UML Klassen- und Sequenzdiagramme]()
- [Dokumentation wichtiger Code Snippets]()
- [Testfaelle bedingt durch Aktzeptanzkriterium]()

9. [Dokumentatin Sprint 2]()
- [Taskliste der User Stories (mit Schätzung)]()
- [Anreicherung der User Stories]()
- [UML Klassen- und Sequenzdiagramme]()
- [Dokumentation wichtiger Code Snippets]()
- [Testfaelle bedingt durch Aktzeptanzkriterium]()


## Einleitung
Das Projekt **Moorhuhn** und das dazugehörige Git-Repository entstand im Rahmen eines Projektarbeit im Kurs Software Engineering. Die Umsetzung wurde durch Java, bzw. Java FX realisiert. 

## Ziele
Das Ziel besteht darin, die in den Fächern _Software Engineering_ sowie _Programmieren II_ erlernten Kompetenzen in einem selbstständigen Projekt umzusetetzen. Wir haben uns dafür entschieden, eine stark vereinfachte Form des Spiels Moorhuhn nach dem Software Engineering Konzept aufzubauen und in Java / Java FX zu programmieren.
Das Programm soll eine Stage erhalten, in welcher man bewegende Objekte durch klicken "ausschalten" kann und soll dafür Punkte erhalten.

## Randbedingungen 
Die verwendete Programmierumbgebung ist JDK 8.0 Eclipse EE, für die graphischen Elemente wird ein im Eclipse installiertes Java FX verwendet werden. Wir wollen das Programm in verschiedene Klassen unterteilen und diese mit Methoden strukturieren. Um die Strukturierung mit mehreren Teilnehmern zu vereinfachen, verwenden wir Maven. Der Datenaustausch, sowie die Archivierung erfolgt in Git.

## Build Anleitung
1. Stellen Sie sicher, dass auf Ihrem PC ein Java Runtime Environment vorhanden ist, falls nicht installieren Sie dieses. (Bspw. JDK 8.0 Eclicspe)
2. Laden Sie die Datei von unserem Repository in [Github](https://github.com/wegwerfWindbreaker/trinat/blob/master) runter
3. Entpacken Sie die diese heruntergeladene Datei in den gewünschten Ordner
4. Kopieren Sie den Pfad der gewünschten Versionsdatei (.jar) in die Zwischenablage
5. Öffnen Sie die Konsole Ihres Rechners
6. Geben Sie dort java -jar gefolgt von dem kopierten Pfad (.jar) ein. 
> Beispiel: *java -jar C:\Users\Hans Zimmer\Downloads\trinat\version02.jar*
7. Bestätigen Sie ihre Eingabe mit Enter
         
## Bedienungsanleitung
  * Eine kurze Anleitung für das Moorhuhn-Spiel:

    - Anwendung nach Build Anleitung starten
    - Es wird sogleich ein Fenster aufgehen, in dem sich je nach Version mehrere Objekte Bewegen. 
    - Das Ziel ist möglichst viele Objekte in der vorgegebenen Zeit zu treffen
    - Jedes getroffene Objekt gibt Punkte
    - Das Ziel ist es, möglichst viele Punkte im Zeitlimit zu erreichen.
* Um eine neue Runde zu starten, müssen Sie den Dialog schliessen und nochmal neu Öffnen

## User Stories in Tabellen Form

|   US     | Beschreibung                     |                   Akzeptanzkriterium             | Story Points | Priorität |
|----------|----------------------------------|--------------------------------------------------|--------------|-----------|
|   US 1   | Als Nutzer möchte ich einfache, bewegte Objekte anklicken können und dafür Punkte erhalten um das Spiel Moorhuhn nachzuempfinden. |             |   21           |   1        |
|   US 2   | Als Spieler möchte ich einen zeitlich begrentzten Spielmodus um mich mit anderen messen zu können.                                          |             |   5           |   2        |
|   US 3   | Als Spieler wünsche ich mir verschiedene Schwierigkeitsstufen um das Level meinen Skills anpassen zu können.                                |             |  8            |   3        |

#
