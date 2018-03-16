# Proiectarea Aplicatiilor Orientate pe Obiecte

Sa se scrie un program care codifica un sir de caractere citit din fișierul “input.txt” si il scrie apoi in fișierul “encoded.bin”. Operatia de codificare presupune urmatorii pasi, pentru fiecare caracter din sirul de intrare: 
- se converteste caracterul in codul sau ASCII echivalent
- la valoarea repsectiva se aduna un numar intreg generat aleator (acelasi numar se adauga la toata caracterele sirului);
- notand cu n1 valoarea cea mai mica a unui caracter codificat și cu n2 valoarea cea mai mare a unui caracter codificat, se calculează caracterul codificat după formula e = n1 + (c + rand)  %  (n2 - n1), unde: e - caracterul codificat, c - caracterul care se codifică, rand - valoarea aleatorie  