import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Storage<Integer>> list = new ArrayList<>();
    Storage<Integer> newStorage=null;
    Storage<Integer> storage1 = new Storage<>(1, "Furniture", 4867);
    Storage<Integer> storage2 = new Storage<>(2, "Electronics", 55);
    Storage<Integer> storage3 = new Storage<>(3, "Clothing", 564);
    list.add(storage1);
    list.add(storage2);
    list.add(storage3);

    while (true) {


        try {
            System.out.println("1. Vreai sa agaugi un item in lista? \n2. Vreai sa sterg un obiect din lista? \n3. Vreai sa vezi articolul dupa anumite criterii? \n4. Afiseaza toate obiectele si informatiile despre ele \n5. Afiseaza toate articolele care nu depasesc cantitatea de 100 de unitati");
            int choice = sc.nextInt();
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                {
                    System.out.println("Ai introdus alt varianta inexistenta, incearca din nou!");
                }
            }
            switch (choice) {
                case 1:

                    int id = 0;
                    String nume = "";
                    int capacity = 0;
                    boolean verificare;
                    while (true) {
                        verificare = true;


                        try {
                            System.out.println("Introdu ID");
                            id = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("ID invalid, dati alt ID");
                            sc.nextLine();
                            continue;

                        }


                        for (Storage<Integer> i : list) {
                            if (i.getId() == id) {
                                System.out.println("Acest ID este deja in lista, dati altul");
                                verificare = false;
                                break;
                            }

                        }
                        if (verificare) {
                            break;
                        }
                        sc.nextLine();

                    }
                    sc.nextLine();

                    try {

                        System.out.println("Introdu denumirea");
                        nume = sc.nextLine();
                        while (true) {
                            boolean exista = false;
                            for (int i = 0; i < list.size(); i++) {

                                if (list.get(i).getNume().equals(nume)) {
                                    System.out.println("Acest nume este deja in lista, dati altul");
                                    nume = sc.nextLine();
                                    exista = true;
                                    break;
                                }
                            }
                            if (!exista) {
                                break;
                            }
                        }


                    } catch (InputMismatchException e) {
                        System.out.println("Denumirea invalida, incearca din nou");
                        sc.nextLine();
                    }


                    while (true) {
                        try {

                            System.out.println("Introdu cantitatea");
                            capacity = sc.nextInt();
                            sc.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Cantitate invalida, incearca din nou");
                            sc.nextLine();
                        }
                    }
                    newStorage = new Storage<>(id, nume, capacity);

                    list.add(newStorage);
                    System.out.println(newStorage);
                    break;
                case 2:
                    int id1;
                    boolean verificare1;
                    try {
                        verificare1 = true;
                        System.out.println("Introdu ID");
                        id1 = sc.nextInt();
                        if (id1 != list.get(list.size() - 1).getId()) {
                        }
                        for (int i = 0; i < list.size(); i++) {

                            if (list.get(i).getId().equals(id1)) {
                                list.remove(i);
                                verificare1 = false;
                            }

                        }
                        if (verificare1) {
                            System.out.println("Acest ID nu este in lista");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("ID invalid, incearca din nou");
                        sc.nextLine();
                    }

                    break;
                case 3:
                    System.out.println("1. Da ID \n 2. Da numele \n 3. Da cantitatea");
                    int rasp = sc.nextInt();
                    int id2 = 0;
                    String nume2 = "";
                    int cant2 = 0;
                    boolean daca, daca1, daca3;
                    switch (rasp) {

                        case 1:
                            while (true) {
                                daca = true;
                                try {
                                    id2 = sc.nextInt();
                                    sc.nextLine();

                                    for (Storage<Integer> s : list) {
                                        if (id2 == s.id) {
                                            System.out.println(s);
                                            daca = false;
                                            break;
                                        }

                                    }
                                    if (daca) {
                                        System.out.println("Acest ID nu exista");
                                    }
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("ID invalid, dati alt ID");
                                    sc.nextLine();
                                }
                            }
                            break;
                        case 2:
                            while (true) {
                                daca1 = true;

                                nume2 = sc.nextLine();
                                for (Storage<Integer> s : list) {
                                    if (nume2.equals(s.getNume())) {
                                        System.out.println(s);
                                        daca1 = false;
                                    }
                                }


                                if (storage1.name == nume2) {
                                    System.out.println(storage1.toString());
                                } else if (storage2.name == nume2) {
                                    System.out.println(storage2.toString());
                                } else if (storage3.name == nume2) {
                                    System.out.println(storage3.toString());
                                } else if (daca1) {
                                    System.out.println("Nume inexistent, dati alt nume");
                                }
                                break;
                            }
                            break;
                        case 3:
                            while (true) {
                                daca3 = true;
                                try {
                                    cant2 = sc.nextInt();
                                    for (Storage<Integer> s : list) {
                                        if (cant2 == s.capacity) {
                                            System.out.println(s);
                                            daca3 = true;
                                        }
                                    }} catch (InputMismatchException e) {
                                    System.out.println("Cantitate invalida");
                                    cant2 = sc.nextInt();
                                    continue;

                                }

                                if (storage1.capacity == cant2) {
                                    System.out.println(storage1.toString());
                                } else if (storage2.capacity == cant2) {
                                    System.out.println(storage2.toString());
                                } else if (storage3.capacity == cant2) {
                                    System.out.println(storage3.toString());
                                } else if (daca3) {
                                    System.out.println("Cantitate inexistenta");
                                }
                                break;
                            }

                    }
                    break;
                case 4:
                    System.out.println(list.toString());
                    break;
                case 5:

                    for (Storage<Integer> s : list) {
                        if (s.capacity>100){
                            System.out.println(s.getNume());
                        }
                    }

                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("ID invalid, incearca din nou");
            sc.nextLine();
        }
    }
}

    public static class Storage<T>{
        T id;
        String name;
        int capacity;
        public Storage(T id, String name, int capacity) {
            this.id = id;
            this.name = name;
            this.capacity = capacity;
        }
        public String toString(){
            return "ID este "+id+", denumirea produsului este "+name+" si cantitatea totala este de "+capacity;
        }
        public T getId() {
            return id;
        }
        public String getNume(){
            return name;
        }

    }
    public static class Article extends Storage<Integer>{

        public Article(Integer id, String name, int quantity) {
            super(id, name, quantity);
        }

    }
}