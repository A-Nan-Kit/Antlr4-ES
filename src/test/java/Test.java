import com.power.es.AIQL.Utils;
import org.elasticsearch.index.query.QueryBuilders;

public class Test {
    public static void main(String[] args) {
        System.out.println(Utils.getEsQuery("! (a == 1 OR b == 4) OR c==3 AND d == 5"));
    }
}
