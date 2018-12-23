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
1. Laden Sie die Datei von unserem Repository in [Github](https://github.com/wegwerfWindbreaker/trinat/blob/master) runter
2. Entpacken Sie die diese heruntergeladene Datei in den gewünschten Ordner
3. Kopieren Sie den Pfad der gewünschten Versionsdatei (.jar) in die Zwischenablage
4. Öffnen Sie die Konsole Ihres Rechners
5. Geben Sie dort java -jar gefolgt von dem kopierten Pfad (.jar) ein. 
> Beispiel: *java -jar C:\Users\Hans Zimmer\Downloads\trinat\version02.jar*
6. Bestätigen Sie ihre Eingabe mit Enter
         
## Bedienungsanleitung
  * Eine kurze Anleitung für das Moorhuhn-Spiel:

    - Anwendung nach Build Anleitung starten
    - Es wird sogleich ein Fenster aufgehen, sich ein Start Button befindet. 
    - Das Ziel ist möglichst viele Objekte in 60 Sekunden zu treffen (nach 60s wird das Spiel automatisch beendet).
    - Jedes getroffene Objekt gibt Punkte
    - Auf Wunsch kann das Spiel vor den 60 Sekunden manuell beendet werden.
 

## User Stories in Tabellenform

|   US     | Beschreibung                     |                   Akzeptanzkriterium             | Story Points | Priorität |
|----------|----------------------------------|--------------------------------------------------|--------------|-----------|
|   1   | Als Spieler möchte ich einfaches, bewegte Objekte anklicken können und dafür Punkte erhalten um das Spiel Moorhuhn nachzuempfinden. |  Die Anwendung soll nach dem Starten in einem Fenster ein bewegtes Objekt anzeigen, welches angeklickt werden kann. Wenn man auf das Objekt klickt, sollen Punkte addiert werden.            |   21           |   Hoch        |
| 2  | Als Spieler wünsche ich mir ein Eingangs-, sowie ein Game-Over-Menü (mit Punktanzeige) um das Spiel starten und beenden zu können. | Das Spiel soll ein Start- und Endmenü haben, in dem bei Spielende die erreichten Punkte angezeigt werden. | 8  | Mittel|
|   3   | Als Spieler möchte ich einen zeitlich begrentzten Spielmodus um mich mit anderen messen zu können.                                          |  Beim Starten der Anwendung soll ein Timer runterzählen und das Spiel zu Ende sein, wenn der Timer auf 0 ist.            |   21           |   Mittel        |
|   4   | Als Spieler wünsche ich mir verschiedene Schwierigkeitsstufen um das Level meinen Skills anpassen zu können.                                |  Zu Beginn des Spiels soll die Auswahl getroffen werden können, welche Schwierigkeitsstufe man spielen will. Anschliessend soll das Fenster aufgehen und die Objekte einfacher oder schwierigerer anzuklicken sein         |  8            |   Niedrig        |


#

## Releaseplan mit den Ausbaustufen
| Userstory | Release 1 | Release 2 | Release 3 |
|-----------|-----------|-----------|-----------|
| 1 | Grundanforderung |  |  |
| 2 |  | Ausbaustufe 1 |  |
| 3 |  | Ausbaustufe 1 |  |
| 4 |  |  |  Ausbaustufe 2 |

## Dokumentation Sprint 1
### Taskliste der User Stories (mit Schätzung)
#### User Story 1
| Task | Beschreibung | Aufwandschätzung in Minuten |
|------|--------------|-----------------------------|
| 1 | Erstellen einer Stage und anschliessend darin befindenden Button | 50 |
| 2 | Button in der Stage bewegen und gleichzeitig Möglichkeit zum Klicken beibehalten | 90 |
| 3 | Beim Klicken des Buttons sollen Punkte addiert werden | 60 |
| 4 | Im Fenster soll eine Anzeige für den Punktestand ersichtlich sein | 30 |
| 5 | Automatisches generieren der Objekte, sodass nicht nur ein Objekt auf dem Bildschrim erscheint | 100 |

### Anreicherung der User Stories
![Bild User Story 1 ](https://github.com/wegwerfWindbreaker/trinat/blob/master/documentary/InkedUS%25201_LI.jpg)
> Die Andwendung soll einen Button im Fenster bewegen, der gedrückt werden kann.
### UML Package, Klassen- und Sequenzendiagramm
> Wird im 2. Sprint vollständig gemacht.
### Dokumentation wichtier Code Snippets
![Code Snippet 1](https://github.com/wegwerfWindbreaker/trinat/blob/master/documentary/Stage%20erstellen.JPG)
> Im oberen Teil wird eine Stage erstell sowie der Fenstertitel und dessen Grösse festgelegt.  
Anschliessend erstellen wir 2 Labels, eines für den Timer und eines für den Punktezähler (Counter).   
Im untersten Teil wird dann noch der Button definiert.    
Bei allen Teilen bestimmen wir mit .. .relocate(x,y); die Position des Objektes.

### Testfaelle bedingt durch Aktzeptanzkriterium

## Dokumentation Sprint 2
### Taskliste der User Stories (mit Schätzung)

#### User Story 2
| Task | Beschreibung | Aufwandschätzung in Minuten |
|------|--------------|-----------------------------|
| 1 | Erstellen einer ersten Stage mit einem "Start" Button | 30 |
| 2 | Bei Klicken des Buttons soll das Fenster sich schliessen und das Hauptfenster erscheinen, auf welchem das Spiel beginnt  | 90 |
| 3 | Im Hauptfenster einen Button erstellen, mit welchem das Spiel beendet werden kann | 60 |
| 4 | Nach Ablauf der Zeit soll das Hauptfenster geschlossen werden und ein "GameOver" Fester erscheinen in welchem die erreichten Punkte angezeigt werden | 90  |

#### User Story 3
| Task | Beschreibung | Aufwandschätzung in Minuten |
|------|--------------|-----------------------------|
| 1 | Erstellen eines Timers welcher von einem Wert (bspw. 60 sec.) auf Null runter zählt | 60 |
| 2 | Integrieren des erstellten Timers in das Programm | 120 |
| 3 | Spiel beenden wenn der Timer Null erreicht hat | 90 |

> _Ziel wurde erreicht, jedoch ist es uns nicht gelungen, dass der Timer angezeigt wird.


### Anreicherung der User Stories
![Bild User Story 3](https://github.com/wegwerfWindbreaker/trinat/blob/master/documentary/US%203.JPG)
> Die Buttons verschwinden hinter stillstehenden Objekten, wodurch das Anklicken erschwert werden soll. Zusätzlich ist das Ziel einen Timer ins Programm zu integrieren.
### UML Package, Klassen- und Sequenzendiagramm
### Dokumentation wichtier Code Snippets
### Testfaelle bedingt durch Aktzeptanzkriterium
