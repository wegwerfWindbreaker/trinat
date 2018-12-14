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
- [UML Package, Klassen- und Sequenzdiagramme]()
- [Dokumentation wichtiger Code Snippets]()
- [Testfaelle bedingt durch Aktzeptanzkriterium]()

9. [Dokumentatin Sprint 2]()
- [Taskliste der User Stories (mit Schätzung)]()
- [Anreicherung der User Stories]()
- [UML Package, Klassen- und Sequenzdiagramme]()
- [Dokumentation wichtiger Code Snippets]()
- [Testfaelle bedingt durch Aktzeptanzkriterium]()


## Einleitung
Das Projekt **Moorhuhn** und das dazugehörige Git-Repository entstand im Rahmen eines Projektarbeit im Kurs Software Engineering. Die Umsetzung wurde durch Java, bzw. Java FX realisiert. 

## Ziele
Das Ziel besteht darin, die in den Fächern _Software Engineering_ sowie _Programmieren II_ erlernten Kompetenzen in einem selbstständigen Projekt umzusetetzen. Wir haben uns dafür entschieden, eine stark vereinfachte Form des Spiels Moorhuhn nach dem Software Engineering Konzept aufzubauen und in Java / Java FX zu programmieren.
Das Programm soll eine Stage erhalten, in welcher man bewegende Objekte durch klicken "ausschalten" kann und soll dafür Punkte erhalten.

## Randbedingungen 
Die verwendete Programmierumbgebung ist JDK 8.0 Eclipse EE, für die graphischen Elemente wird ein im Eclipse installiertes Java FX verwendet werden. Wir wollen das Programm in verschiedene Klassen unterteilen und diese mit Methoden strukturieren. Um die Strukturierung mit mehreren Teilnehmern zu vereinfachen, verwenden wir Maven. Der Datenaustausch, sowie die Archivierung erfolgt in Git.

## Build Anleitung _NOCHMAL KONTROLLIEREN!!_
1. Stellen Sie sicher, dass auf Ihrem PC ein Java Runtime Environment vorhanden ist, falls nicht installieren Sie dieses. (Bspw. JDK 8.0 Eclicspe)
2. Laden Sie die Datei von unserem Repository in [Github](https://github.com/wegwerfWindbreaker/trinat/blob/master) runter
3. Entpacken Sie die diese heruntergeladene Datei in den gewünschten Ordner
4. Kopieren Sie den Pfad der gewünschten Versionsdatei (.jar) in die Zwischenablage
5. Öffnen Sie die Konsole Ihres Rechners
6. Geben Sie dort java -jar gefolgt von dem kopierten Pfad (.jar) ein. 
> Beispiel: *java -jar C:\Users\Hans Zimmer\Downloads\trinat\version02.jar*
7. Bestätigen Sie ihre Eingabe mit Enter
         
## Bedienungsanleitung _VIELEICHT NOCH SCHWIERIGKEITS AUSWAHL HINZUFÜGEN_
  * Eine kurze Anleitung für das Moorhuhn-Spiel:

    - Anwendung nach Build Anleitung starten
    - Es wird sogleich ein Fenster aufgehen, in dem sich je nach Version mehrere Objekte Bewegen. 
    - Das Ziel ist möglichst viele Objekte in der vorgegebenen Zeit zu treffen
    - Jedes getroffene Objekt gibt Punkte
    - Das Ziel ist es, möglichst viele Punkte im Zeitlimit zu erreichen.
* Um eine neue Runde zu starten, müssen Sie den Dialog schliessen und nochmal neu Öffnen

## User Stories in Tabellenform

|   US     | Beschreibung                     |                   Akzeptanzkriterium             | Story Points | Priorität |
|----------|----------------------------------|--------------------------------------------------|--------------|-----------|
|   1   | Als Spieler möchte ich ein einfaches, bewegtes Objekt anklicken können und dafür Punkte erhalten um das Spiel Moorhuhn nachzuempfinden. |  Die Anwendung soll nach dem Starten in einem Fenster ein bewegtes Objekt anzeigen, welches angeklickt werden kann. Wenn man auf das Objekt klickt, sollen Punkte addiert werden.            |   21           |   Hoch        |
|   2   | Als Spieler möchte ich einen zeitlich begrentzten Spielmodus um mich mit anderen messen zu können.                                          |  Beim Starten der Anwendung soll ein Timer runterzählen und das Spiel zu Ende sein, wenn der Timer auf 0 ist.            |   5           |   Hoch        |
|   3   | Als Spieler wünsche ich mir verschiedene Schwierigkeitsstufen um das Level meinen Skills anpassen zu können.                                |  Zu Beginn des Spiels soll die Auswahl getroffen werden können, welche Schwierigkeitsstufe man spielen will. Anschliessend soll das Fenster aufgehen und die Objekte einfacher oder schwierigerer anzuklicken sein         |  8            |   Mittel        |
| 4  | Als Spieler wünsche ich mir ein Eingangs-, sowie ein Game-Over-Menü um den das Interface ansprechend zu empfinden. | Das Spiel soll ein Start- und Endmenü haben, in dem einige Optionen ausgwählt werden können (Music, Farbmodus, etc..). | 21  | Niedrig|

#

## Releaseplan mit den Ausbaustufen
| Userstory | Release 1 | Release 2 | Release 3 |
|-----------|-----------|-----------|-----------|
| 1 | Grundanforderung |  |  |
| 2 | Grundanforderung |  |  |
| 3 |  | Ausbaustufe 1 |  |
| 4 |  |  |  Ausbaustufe 2 |

## Dokumentation Sprint 1
### Taskliste der User Stories (mit Schätzung)
#### User Story 1
| Task | Beschreibung | Aufwandschätzung in Minuten |
|-----------|-----------|-----------|-----------|
| 1 | Erstellen einer Stage und anschliessend darin befindenden Button | 40 |
| 2 | Button in der Stage bewegen und gleichzeitig Möglichkeit zum Klicken erhalten | 40 |
| 3 | Beim Klicken des Buttons sollen Punkte addiert werden | 50 |

#### User Story 2
| Task | Beschreibung | Aufwandschätzung in Minuten |
|-----------|-----------|-----------|-----------|
| 1 | Erstellen eines Timers, der auf Null runter zählt | 60 |
| 2 | Integrieren des Timers in das Spiel | 60 |
| 3 | Spiel beenden wenn Timer auf Null ist | 60 |

### Anreicherung der User Stories
### UML Package, Klassen- und Sequenzendiagramm
### Dokumentation wichtier Code Snippets
### Testfaelle bedingt durch Aktzeptanzkriterium

## Dokumentation Sprint 2
### Taskliste der User Stories (mit Schätzung)
### Anreicherung der User Stories
### UML Package, Klassen- und Sequenzendiagramm
### Dokumentation wichtier Code Snippets
### Testfaelle bedingt durch Aktzeptanzkriterium
