package dao;

import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import po.Conctact;

public class ContactDao {
    Session session = HibernateUtil.getSession();

    public String addAdvice(Conctact conctact){
        Transaction ts = session.beginTransaction();
        try {
            session.save(conctact);
            ts.commit();
            return "true";
        }catch (Exception e) {
            System.out.println(e);
            return "false";
        } finally {
            if(session != null)
                session.close();
        }
    }
}
