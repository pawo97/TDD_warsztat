# TDD_warsztat

# Przwodnik po testach:
## Wprowadzenie:
Dane repozytorium zawiera system dodawania ocen do dzienniczka przez nauczyciela. Znajduje sie w nim 7 testów. 
Etap testów jest podzielony na 3 etapy:

1. Red
2. Green
3. Refactor

W przypadku problemów proszę przełączyć się na odpowiedni branch, tam jest napisany test red lub test green. W przypadku przelaczania sie SMART CHECKOUT -> Accept Theirs. Ze względu na dużą ilość branchy, 3 etap jest do waszej dyspozycji :). Należy etapami zaimplementować najpierw test, a potem funkcjonalność.

## Szybka dokumentacja:

* Obiekt GradeBook metody:
- GradeBook getInstance() {}
- void addSubject(String subject) {}
- Subject getSubject(String subject) {}
- void addNote(String subjectName, double note) {}
- double getAverageNote() {}
* Obiekt Subject metody:
- Subject(String name) {}
- String getName() {}
- void addNote(double note) {}
- List<Double> getNotes() {}
- double getAverage() {}

## Instrukcja:

1. Setup i Test 1:
* W ramach setupu należy w pliku testowym globalnie zaimplementować:
- dwa stringi z nazwami przedmiotów.
- obiekt dzienniczka
* W setupie:
- zainicjalizować obiekt dzienniczka getInstance()
- dodać jeden z przedmiotów wyżej do dzienniczka
* shouldBeAbleToCreateGradeBook():
- stworzenie obiektu dzienniczka i sprawdzenie czy nie jest nullem (assertNotNull())

2. Test 2:
* shouldntAllowToAddSubjectThatAlreadyExists():
- sprawdzenie czy można dodać dwa te same przedmioty do dzienniczka, wynikiem powinien być IllegalArgumentException (assertThrows( nazwa klasy wyjątku.class,  () -> metoda);

3. Test 3:
* shouldGetValidSubjectFromGradeBook():
- pobranie przedmiotu po nazwie i sprawdzenie czy pobrał się aktualny (assertEquals()), (Można wykorzystać stringi dodane na początku :))

4. Test 4:
* shouldntAllowToGetNonExistingSubject():
- sprawdzenie czy można pobrać przedmiot który nie istnieje, powinien być IllegalArgumentException (assertThrows( nazwa klasy wyjątku.class,  () -> metoda);

5. Test 5:
* UWAGA! w Subject wymagane napisanie metody List<Double> getNotes() {}
* shouldBeAbleToAddNote():
- sprawdzenie czy można dodać ocene do przedmiotu (assertEquals())

6. Test 6:
* shouldntAllowToAddANoteToNonExistingSubject():
- sprawdzenie czy mozna dodac ocene do przedmiotu, który nie istnieje, powinien być IllegalArgumentException. Jeśli dobrze została wykonana implementacja, test powinien przejść od razu :)

7. Test 7:
* shouldComputeGlobalAverageNote():
- obliczenie średniej ze wszystkich ocen, najlepiej z każdego przedmiotu osobno. (Podpowiedź każdy przedmiot ma w sobie metodę liczącą średnią)


