import java.math.BigInteger;
import java.util.Random;

/**
 * Created by gordeevnm on 14.02.17.
 */
public class Client {
    private BigInteger g;
    private BigInteger c;
    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger A;

    public Client(BigInteger g, BigInteger c) {
        System.out.println("new Client(" + g + ", " + c + ")");
        this.g = g;
        this.c = c;
        privateKey = BigInteger.probablePrime(256, new Random());
//        privateKey = new BigInteger(128, new Random());
        if (privateKey.compareTo(BigInteger.ZERO) < 0)
            privateKey = privateKey.negate();
    }

    public Client() {
        System.out.println("new Client()");
        c = BigInteger.probablePrime(256, new Random());
        if (c.compareTo(BigInteger.ZERO) < 0)
            c = c.negate();
        g = BigInteger.probablePrime(256, new Random());
        if (g.compareTo(BigInteger.ZERO) < 0)
            g = g.negate();
        privateKey = BigInteger.probablePrime(256, new Random());
        if (privateKey.compareTo(BigInteger.ZERO) < 0)
            privateKey = privateKey.negate();
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }

    public void setB(BigInteger B) {
        publicKey = B.modPow(privateKey, c);
    }

    public BigInteger getA() {
        if (A == null)
            A = g.modPow(privateKey, c);

        return A;
    }

    public BigInteger getG() {
        return g;
    }

    public BigInteger getC() {
        return c;
    }
}
