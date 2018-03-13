# Proiectarea Aplicatiilor Orientate pe Obiecte

Sa se scrie un program care codifica un sir de caractere citit din fișierul “input.txt” standard de intrare si il scrie apoi in fișierul “encoded.bin”. Operatia de codificare presupune urmatorii pasi, pentru fiecare caracter din sirul de intrare: 
- se converteste caracterul in codul sau ASCII echivalent
- la valoarea repsectiva se aduna un numar intreg generat aleator (acelasi numar se adauga la toata caracterele sirului);
- notand cu n1 valoarea ASCII cea mai mica a unui caracter afisabil, iar cu n2 valoarea cea mai mare, daca valoarea rezultata dupa adunare depaseste pe n2, atunci din numarul respectiv se scade cel mai mare multiplu posibil de n2 din acest numar (care nu depaseste numarul initial) si se adauga n1 la numarul rezultat; in acest fel valoarea rezultata este intre n1 si n2;
