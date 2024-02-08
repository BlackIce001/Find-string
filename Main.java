import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String a = sc.nextLine();
        System.out.println("Enter the string to be found:");
        String b = sc.nextLine();
        try {
            int c = compareString(a, b);
            System.out.println("The target string is found");
            System.out.println("The number of operands: " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static int compareString(String a, String b) throws Exception {
        if (!a.contains(b)) {
            throw new Exception("Target string not found");
        }
        int c = b.split("\\s+").length;
        return c;
    }
}


