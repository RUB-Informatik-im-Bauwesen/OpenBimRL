# OpenBimRL

> **Schema:** XSD <br>
> **Current Version:** 2023.07.1 <br>
> **First Publication Date:** 10.06.2022 <br>
> **Autors:** Marcel Stepien, André Vonthron <br>
> **E-Mail:** marcel.stepien@ruhr-uni-bochum.de <br>
> **Licence:** MIT (Java-Sources), CC-BY-4.0 (XSD Schema)
<br>

## Beschreibung

Angelehnt an graphenbasierte Programmierung (bspw. Dynamo und Grasshopper) beschreibt das OpenBimRL Format eine Regelsprache 
zur formellen und fachlichen Prüfung von Bauwerksmodellen. Das Format definiert eine dynamisch erweiterbare Schnittstelle, 
auf derer Basis Bausteine für einen graphenbasierten Prüfvorgang konstruiert und verknüpft werden können. 
Bei der Entwicklung wurde Wert auf Offenheit und Transparenz der Prüfungsdokumente gelegt. 
Im Gegensatz zu den meisten verfügbaren Regel- und Abfragesprachen ist es möglich sowohl Semantik als auch Geometrie zu prüfen, 
solange die verfügbare Engine die dazugehörigen Knoten und Kanten der Vorberechnung auflösen kann.

Die Schema-Inhalte werden in Bereich [Dokumentation](doc/README.md) beschrieben.

## Implementierungen

Im Rahmen von Forschungsprojekten wurden prototypische Referenzimplementierungen 
durch die Ruhr-Universität Bochum vorgenommen:

- [OpenBIMRL-Engine](https://github.com/RUB-Informatik-im-Bauwesen/OpenBimRL-Engine)
- [OpenBIMRL-CreatorTool](https://github.com/RUB-Informatik-im-Bauwesen/OpenBimRL-CreatorTool)

## Veröffentlichungen

* [Konferenz-Paper](https://www.ucl.ac.uk/bartlett/construction/sites/bartlett_construction/files/5342.pdf) der [EG-ICE 2023](https://www.ucl.ac.uk/bartlett/construction/research/virtual-research-centres/institute-digital-innovation-built-environment/30th-eg-ice-1) vorgestellt. 
