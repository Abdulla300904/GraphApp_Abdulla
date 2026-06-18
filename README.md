# Graphenprojekt

## Beschreibung

Dieses Projekt wurde in Java erstellt.

Das Programm liest eine Adjazenzmatrix aus einer CSV-Datei ein und berechnet verschiedene Eigenschaften eines Graphen.

## Funktionen

- Einlesen einer CSV-Datei
- Berechnung der Distanzen
- Berechnung der Exzentrizitäten
- Bestimmung des Radius
- Bestimmung des Durchmessers
- Bestimmung des Zentrums
- Dijkstra-Algorithmus für kürzeste Wege

## Projektstruktur

- Main.java – Startpunkt des Programms
- GraphReader.java – Einlesen der CSV-Datei
- GraphApp.java – Berechnung von Exzentrizitäten, Radius, Durchmesser und Zentrum
- Dijkstra.java – Berechnung der kürzesten Wege

## Beispiel

CSV-Datei:

```csv
;A;B;C;D
A;0;3;0;7
B;3;0;1;2
C;0;1;0;4
D;7;2;4;0
```

Kompilieren:

```bash
javac *.java
```

Starten:

```bash
java Main graph.csv
```

## Autor

Abdulla Sakhizov 6ACIF