package handson3;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else if (i > 15) {
                break;
            }
            System.out.println(i);
        }
    }
}