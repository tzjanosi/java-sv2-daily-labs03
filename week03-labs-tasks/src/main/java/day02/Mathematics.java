package day02;

public class Mathematics {
    boolean isPrime(long number){
        boolean prim=true;
        if(number<2) {
            return false;
        }
        else {
            long i = 2;
            while (prim && i <= Math.sqrt(number)) {
                if ((number % i) == 0) {
                    prim = false;
                }
                i++;
            }
            return prim;
        }
    }
}
