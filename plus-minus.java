import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int  zero=0;
    int  pos=0;
    int  neg=0;
    for(int i=0;i<arr.size();i++)
    {
        if((arr.get(i))<0)
        {
            neg++;
        }
        else if((arr.get(i))>0)
        {
            pos++;
        }
        else
        {
            zero++;
        }
    }
    int  n =arr.size();
    float posres=pos/n;
    float negres=neg/n;
    
    float zerores=zero/n;
    System.out.println(posres);
    System.out.println(negres);
    System.out.print(zerores);

    }

}

public class plus-minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
