import com.power.es.AIQL.Utils;
import org.elasticsearch.index.query.QueryBuilders;

public class Test {
    @org.junit.Test
    public void commonTest(String[] args) {
        System.out.println(Utils.getEsQuery("! (a == 1 OR b == 4) OR c==3 AND d == 5"));
    }
}
