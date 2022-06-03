//Patterns using loops. The questions i got it from: github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class patterns {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n;
        pattern1(n = 5);
    }

    //  static void pattern(int n) {}

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
