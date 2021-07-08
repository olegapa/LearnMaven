public class IsEven {
    IsEven() {
        int n = (new RandomNum()).getN();
        if (n % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}