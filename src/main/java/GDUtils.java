import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

import java.util.regex.Pattern;

/**
 * Created by Ivan on 17.01.2016.
 */
public class GDUtils {

    private static final Pattern CSV = Pattern.compile(",");
    public  static JavaRDD<DataPoint> loadCSVFile(JavaSparkContext sc, String path, int numFeatures){
        JavaRDD<String> lines = sc.textFile(path);
        final int D = numFeatures;
        JavaRDD<DataPoint> points = lines.map(
                new Function<String, DataPoint>() {
                    public DataPoint call(String line) {
                        String[] tok = CSV.split(line);
                        double y = Double.parseDouble(tok[0]);
                        double[] x = new double[D];
                        x[0] = 1; // for theta zero
                        for (int i = 1; i < D; i++) x[i] = Double.parseDouble(tok[i]);
                        return new DataPoint(x, y);
                    }
                });

        return points;
    }
}
