package db;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBHelper {
    private static Session session;
    private static Transaction transaction;

    public static void save(Object object){
        session = HibernateUtil.getSessionFactory().openSession();

        try{
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        }catch (HibernateException ex){
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }

    }

    public static void update(Object object) {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();

        }
    }

    public static void delete(Object object){
        session = HibernateUtil.getSessionFactory().openSession();

        try{
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (HibernateException ex){
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> T findById(int id, Class classTYpe){
        session = HibernateUtil.getSessionFactory().openSession();
        T result = null;

        try{
            Criteria cr = session.createCriteria(classTYpe);
            cr.add(Restrictions.eq("id", id));
            result =(T) cr.uniqueResult();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static <T> List<T> findAll(Class classtype){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> result = null;

        try{
            Criteria cr = session.createCriteria(classtype);
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

}
