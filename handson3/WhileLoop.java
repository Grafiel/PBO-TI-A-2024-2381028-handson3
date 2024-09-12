package handson3;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) {
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
        }
    }
}