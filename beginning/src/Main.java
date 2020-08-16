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
    }
}
