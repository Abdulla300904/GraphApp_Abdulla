import java.io.*;
import java.util.*;

public class GraphReader {

    public static int[][] readGraph(String filename) throws IOException {

        List<int[]> rows = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line;
        
        br.readLine();

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) {
                continue;
            }

            String[] values = line.split(";");

            int[] row = new int[values.length - 1];


            for (int i = 1; i < values.length; i++) {
                row[i - 1] = Integer.parseInt(values[i]);
            }

            rows.add(row);
        }

        br.close();

        return rows.toArray(new int[0][]);
    }
}
