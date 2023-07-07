import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class ConexionAlumno {
    public DB db;
    public DBCollection coleccion;
    public DBCursor cursor = null;
    public BasicDBObject document = new BasicDBObject();

    public void conexion(){

    }
}