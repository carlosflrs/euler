/** Find the ARGS[0] adjecent digits in the 1000-digit number that have
 * the greatest product. Largest consecutive digit number without a 0 in it
 * is 62, therefore anything above 62 returns 0.
 * @author Carlos A. Flores-Arellano.
 * */

import java.util.ArrayList;

public class Eight {

    private static final String NUMBER = 
        "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

    private static ArrayList<Integer> _digits;
    
    private static int[] _number = new int[1000];

    private static int _first, _last;

    public static void main (String[] args) {
        _digits = new ArrayList<>();
        int i;
        for (i = 0; i < 1000; i = i + 1) {
            _number[i] = Integer.parseInt(String.valueOf(NUMBER.charAt(i)));
        }
        findLargestProduct(Integer.parseInt(args[0]));
        String product = String.valueOf(product(_first, _last));
        fillDigits();
        System.out.printf("Digits: %s%nProduct: %s%n", _digits, product);
    }
    
    private static void findLargestProduct(int x) {
        int i = 0;
        int j = x - 1;
        long largestProduct = -1;
        long current = -1;
        while (j < 1000) {
            current = product(i, j);
            if (current > largestProduct) {
                largestProduct = current;
                _first = i;
                _last = j;
            }
            i = i + 1;
            j = j + 1;
        }
    }

    private static long product(int i, int j) {
        long product = 1;
        while (i <= j) {
            if (product == 0) {
                break;
            }
            product = product * _number[i];
            i = i + 1;
        }
        return product;
    }

    private static void fillDigits() {
        while (_first <= _last) {
            _digits.add(_number[_first]);
            _first = _first + 1;
        }
    }
    
}
