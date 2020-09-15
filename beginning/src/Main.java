import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    // tasks 1 - p. 34
        // task 1
        String name = "Paweł";
        System.out.println("Witaj, " + name);

        // task 2
        System.out.print("Hej\n");
        System.out.printf("Aga\n");

        // task 3
        float f = 3.14567f;
        System.out.printf("%.2f", f);
        System.out.println();

        // task 4
        String s = "Paweł";
        String t = "Kondel";
        String u = "Białystok";
        System.out.printf("%15s %15s %15s", s, t, u);
        System.out.println();

        // task 5
        int i = 192;
        int j = 168;
        int k = 1;
        int l = 10;
        String hex = String.format("%1$02X:%2$02X:%3$02X:%4$02X", i, j, k, l);
        System.out.println(hex);

    // Tasks 2 - p. 36
        // Task 1
        System.out.print("Enter your name: ");
        String name2 = in.nextLine();
        System.out.println("Witaj, " + name2);

        // Task 2
        int m = in.nextInt();
        double n = in.nextDouble();
        System.out.println((int) m + n);

        // Task 3
        System.out.print("Wprowadź pierwszą liczbę: ");
        int i1 = in.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int i2 = in.nextInt();
        System.out.println("Wynik dzielenia a/b = " + (double) + i1/i2);

    // Tasks 3 - p. 41
        // Task 1
        System.out.print("Name: ");
        String name3 = in.nextLine();
        String firstLetterOfName = name3.substring(0, 1);
        String firstLetterOfNameToUpperCase = firstLetterOfName.toUpperCase();
        String fromSecondLetterOfName = name3.substring(1);
        StringBuilder newName3 = new StringBuilder().append(firstLetterOfNameToUpperCase).append(fromSecondLetterOfName);
        name3 = newName3.toString();
        System.out.print("Surname: ");
        String surname3 = in.nextLine();
        String firstLetterOfSurname = surname3.substring(0, 1);
        String firstLetterOfSurnameToUpperCase = firstLetterOfSurname.toUpperCase();
        String fromSecondLetterOfSurname = surname3.substring(1);
        StringBuilder newSurname3 = new StringBuilder().append(firstLetterOfSurnameToUpperCase).append(fromSecondLetterOfSurname);
        surname3 = newSurname3.toString();
        System.out.print("Age: ");
        int age3 = in.nextInt();
        System.out.println(name3 + " " + surname3 + ", " + age3);

    // Tasks 4 - p. 44
        // Task 1
        int naszaLiczba = in.nextInt();
        if (naszaLiczba < 10) {
            System.out.println("Nasza liczba jest mniejsza od 10");
        } else if (naszaLiczba == 10) {
            System.out.println("Nasza liczba jest równa 10");
        } else {
            System.out.println("Nasza liczba jest większa od 10");
        }

        // Task 2
        int naszaLiczba2 = in.nextInt();
        if (naszaLiczba2 == 0) {
            System.out.println(")");
        } else if (naszaLiczba2 == 1) {
            System.out.println("!");
        } else if (naszaLiczba2 == 2) {
            System.out.println("@");
        } else if (naszaLiczba2 == 3) {
            System.out.println("#");
        } else if (naszaLiczba2 == 4) {
            System.out.println("$");
        } else if (naszaLiczba2 == 5) {
            System.out.println("%");
        } else if (naszaLiczba2 == 6) {
            System.out.println("^");
        } else if (naszaLiczba2 == 7) {
            System.out.println("&");
        } else if (naszaLiczba2 == 8) {
            System.out.println("*");
        } else if (naszaLiczba2 == 9) {
            System.out.println("(");
        }

        // Task 3
        String naszaLiczba3 = in.next();
        if (naszaLiczba3 == "zero") {
            System.out.println(")");
        } else if (naszaLiczba3.equals("jeden")) {
            System.out.println("!");
        } else if (naszaLiczba3.equals("dwa")) {
            System.out.println("@");
        } else if (naszaLiczba3.equals("trzy")) {
            System.out.println("#");
        } else if (naszaLiczba3.equals("cztery")) {
            System.out.println("$");
        } else if (naszaLiczba3.equals("pięć")) {
            System.out.println("%");
        } else if (naszaLiczba3.equals("sześć")) {
            System.out.println("^");
        } else if (naszaLiczba3.equals("siedem")) {
            System.out.println("&");
        } else if (naszaLiczba3.equals("osiem")) {
            System.out.println("*");
        } else if (naszaLiczba3.equals("dziewięć")) {
            System.out.println("(");
        }

    // Tasks 5 - p. 47
        // Task 1
        int naszaLiczba4 = in.nextInt();
        switch (naszaLiczba4) {
            case 0:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 1:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 2:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 3:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 4:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 5:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 6:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 7:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 8:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 9:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 10:
                System.out.println("Nasza liczba jest równa 10");
                break;
            default: System.out.println("Nasza liczba jest większa od 10");
            break;
        }

        // Task 2
        int naszaLiczba5 = in.nextInt();
        switch (naszaLiczba5) {
            case 0:
                System.out.println(")");
                break;
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("@");
                break;
            case 3:
                System.out.println("#");
                break;
            case 4:
                System.out.println("$");
                break;
            case 5:
                System.out.println("%");
                break;
            case 6:
                System.out.println("^");
                break;
            case 7:
                System.out.println("&");
                break;
            case 8:
                System.out.println("*");
                break;
            case 9:
                System.out.println("(");
                break;
        }

        // Task 3
        String naszaLiczba6 = in.next();
        switch (naszaLiczba6) {
            case "zero":
                System.out.println(")");
                break;
            case "jeden":
                System.out.println("!");
                break;
            case "dwa":
                System.out.println("@");
                break;
            case "trzy":
                System.out.println("#");
                break;
            case "cztery":
                System.out.println("$");
                break;
            case "pięć":
                System.out.println("%");
                break;
            case "sześć":
                System.out.println("^");
                break;
            case "siedem":
                System.out.println("&");
                break;
            case "osiem":
                System.out.println("*");
                break;
            case "dziewięć":
                System.out.println("(");
                break;
        }

        // Task 4
        int naszaLiczba7 = in.nextInt();
        switch (naszaLiczba7) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1 0");
                break;
            case 2:
                System.out.println("2 1 0");
                break;
            case 3:
                System.out.println("3 2 1 0");
                break;
            case 4:
                System.out.println("4 3 2 1 0");
                break;
            case 5:
                System.out.println("5 4 3 2 1 0");
                break;
            case 6:
                System.out.println("6 5 4 3 2 1 0");
                break;
            case 7:
                System.out.println("7 6 5 4 3 2 1 0");
                break;
            case 8:
                System.out.println("8 7 6 5 4 3 2 1 0");
                break;
            case 9:
                System.out.println("9 8 7 6 5 4 3 2 1 0");
                break;
        }

        // Task 5
        double firstNumber = in.nextDouble();
        double secondNumber = in.nextDouble();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        String choice;
        do {
            choice = in.next();
            if (choice.equals("suma")) {
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            } else if (choice.equals("różnica")) {
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            }

            switch (choice) {
                case "suma":
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case "różnica":
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case "iloczyn":
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case "iloraz":
                    if (secondNumber == 0) {
                        System.out.println("Nie można dzielić przez 0");
                        break;
                    }
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    break;
            }
        } while (!choice.equals("koniec"));

        // Task 6
        int analizedNumber = in.nextInt();
        if (analizedNumber%2==0) {
            System.out.println("Liczba jest parzysta.");
        } else System.out.println("Liczba jest nieparzysta.");

        int secondNumber2 = in.nextInt();
        if (analizedNumber%secondNumber2==0) {
            System.out.println("Pierwsza liczba jest podzielna przez drugą.");
        } else System.out.println("Pierwsza liczba nie jest podzielna przez drugą.");

    // Tasks 6 - p. 52
        // Task 1
        for (int o = 1; o <= 10; o++) {
            String product = in.next();
            System.out.println("dodałem do koszyka " + product + ". To nasz " + o + " produkt!");
        }

        // Task 2
        int r = 0;
        for (int o = 0; o < 5; o++) {
            int st = in.nextInt();
            r += st;
        }
        System.out.println("Suma liczb wynosi " + r);

        // Task 3
        for (int o = 0; o < 3; o++) {
            for (int p = 0; p < 2; p++) {
                System.out.println(o + " : " + p);
            }
        }

        // Task 4
        int tu = in.nextInt();
        for (int o = 0; o < tu; o++) {
            for (int p = 0; p < tu; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 5
        int uv = in.nextInt();
        String su = in.next();
        for (int o = 0; o < uv; o++) {
            for (int p = 0; p < uv; p++) {
                System.out.print(su);
            }
            System.out.println();
        }

        // Task 6
        for (int o = 0; o < uv; o++) {
            for (int p = uv-o; p <= uv; p++) {
                System.out.print(su);
            }
            System.out.println();
        }
    }
}