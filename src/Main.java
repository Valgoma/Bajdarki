import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT"));
        int N = sc.nextInt();
        int D = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i<N; i++)
        {
            array[i] = sc.nextInt();
        }
        int counter = N;
        for (int i = N-1; i >= 1; i--)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (array[i] + array[j] <= D)
                {
                    counter = counter - 1;
                    array[i] = D;
                    array[j] = D;
                }
            }
        }
        String outputFName = "OUTPUT";
        String s = String.valueOf(counter);
        Files.writeString(Path.of(outputFName), s);
    }
}