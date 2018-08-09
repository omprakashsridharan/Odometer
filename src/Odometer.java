import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Odometer {
    int reading;
    int max;
    int min;


    public Odometer(int number) {
        reading = number;
        System.out.println("reading"+reading);
        String maxString="";
        String minString="";
        for(int i=0;i<(reading+"").length();i++)
        {
            maxString = (9-i) + maxString;
            minString= (i+1) + minString;
        }
        max = Integer.parseInt(maxString);
        min = Integer.parseInt(minString);
    }

    private int prev(){
        if(reading == min)
            return max;
        for(int i=reading-1;i>=min;i--){
            System.out.println(i);
            if(isValid(i)){
                return i;
            }
        }
        return max;
    }

    private int next(){
        if(reading == max)
            return min;
        for(int i=reading+1;i<=max;i++)
            if(isValid(i)){
            return i;
            }
        return min;
    }

    private boolean isValid(int number){
        char[] tmp = (number+"").toCharArray();
        for(int i=0;i<tmp.length-1;i++){
            if(tmp[i]>=tmp[i+1])
                return false;
        }
        return true;
    }

    public int nextNthReading(int n){
        for(int i=0;i<n;i++)
            reading = next();
        System.out.println(reading);
        return reading;

    }
    public int prevNthReading(int n){
        for(int i=0;i<n;i++)
        {reading = prev();
        System.out.println("----"+reading);}
        return reading;

    }


}
