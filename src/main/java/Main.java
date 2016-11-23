/**
 * Created by Tom on 23/11/2016.
 */
import static spark.Spark.*;

public class MaSin {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}