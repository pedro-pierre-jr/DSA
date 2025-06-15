import java.math.BigInteger;

public class TesteNo {
    public static void main(String[] args) {
        No<String> noS = new No<>("Hello World");
        No<Integer> noI = new No<>(123456);
        No<BigInteger> noB = new No<>(new BigInteger("123456789123456789"));
    }
}
