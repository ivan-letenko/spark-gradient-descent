import java.io.Serializable;

public class DataPoint implements Serializable {
    DataPoint(double[] x, double y) {
        this.x = x;
        this.y = y;
    }

    double[] x;
    double y;
}
