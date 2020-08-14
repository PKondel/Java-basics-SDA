public class Main {

    public static void main(String[] args) {
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
    }
}
