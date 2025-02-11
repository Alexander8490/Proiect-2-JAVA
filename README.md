Exercițiu Avansat Java: Gestionarea Stocurilor cu Programare Generică
Context: Lucrezi la dezvoltarea unui sistem pentru gestionarea stocurilor într-un depozit online. Sistemul trebuie să fie generic, flexibil și capabil să gestioneze diferite tipuri de articole, fiecare având caracteristici specifice.

Cerere:

Proiectează o clasă generică Storage<T> care va gestiona stocurile de articole. Această clasă trebuie să fie capabilă să:

Adauge articole în stoc. Dacă un articol cu același id există deja, aruncă o excepție personalizată DuplicateItemException.
Elimine articole din stoc folosind id-ul. Dacă id-ul nu există, aruncă o excepție ItemNotFoundException.
Caută articole după diferite criterii, cum ar fi numele sau cantitatea.
Filtreze articolele după un atribut specific, cum ar fi cantitatea sau numele.

Obiectele initiale: Furniture, Electronics si Clothing.

Scrieți teste unitare extinse pentru a acoperi toate cazurile posibile, inclusiv gestionarea excepțiilor și verificarea corectitudinii operațiunilor de căutare.

Exemplu de Scenariu:

Creează un depozit pentru stocarea articolelor de mobilă, electronice și haine.
Adaugă articole diferite în depozit și verifică dacă sunt stocate corect.
Caută un articol după nume și afișează detalii despre acesta.
Elimină un articol după id și verifică dacă operația a fost efectuată corect.
Filtrează articolele care depășesc o cantitate specificată și afișează-le.

Concluzie: Acest exercițiu este conceput pentru a testa cunoștințele avansate de programare generică, gestionarea excepțiilor și optimizarea colecțiilor.
