import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Odometer {
    ArrayList<Integer> digits;
    static BigInteger RANGE = new BigInteger("123456789");


    public Odometer(int number) {
        digits = toArray(number);
    }

    private ArrayList<Integer> toArray(int number) {
        ArrayList<Integer> arrayList = new ArrayList();
        while (number>0){
            arrayList.add(number%10);
            number /= 10;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }


}
