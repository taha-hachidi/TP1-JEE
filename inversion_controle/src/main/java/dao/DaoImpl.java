package dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version of Base");
        double temp = Math.random()*70;
        return temp;
    }
}
