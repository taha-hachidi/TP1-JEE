package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version");
        double tmp=8600;
        return tmp;
    }
}
