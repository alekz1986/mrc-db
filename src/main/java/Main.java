import com.mercadv.commons.db.factory.DatabaseFactory;
import com.mercadv.commons.db.factory.EDatabase;
import com.mercadv.commons.db.factory.IDatabase;

public class Main {

	public static void main(String[] args) {
		IDatabase mysql = DatabaseFactory.getDatabase(EDatabase.MYSQL);
		mysql.getSchemaContador().getConnection();
	}
	
}
