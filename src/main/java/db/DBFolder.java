package db;

import models.File;
import models.Folder;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBFolder {
    private static Session session;
    private static Transaction transaction;


    public static List<File> getAllFilesFromAFolder(Folder folder){
        session = HibernateUtil.getSessionFactory().openSession();
        List<File> result = null;

        try{
            Criteria cr = session.createCriteria(File.class);
            cr.add(Restrictions.eq("folder", folder));
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }
}
