/**
 * Created by gordeevnm on 21.02.17.
 */
public class Modpow {
    public static void main(String... args) {
        System.out.println(modpow(595, 703, 991));
        //ответ = 342
    }

    private static long modpow(long a, long e, long m) {
       String eBin= Long.toBinaryString(e);

       long result = a;
       for (int i = 1; i < eBin.length(); i++) {
           result = result * result * (eBin.charAt(i) == '1' ? a : 1);
           result = result % m;
       }

       return result;
    }
}
