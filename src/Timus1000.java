/**/
import java.io.*;       // Java i/o library
import java.util.Scanner;


public class Timus1000 {
    public int sum(int first, int second) {
        return first+second;
    }

    public static void main(String[] arg){
        Timus1000 math = new Timus1000();
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(math.sum(first,second));
    }
}


