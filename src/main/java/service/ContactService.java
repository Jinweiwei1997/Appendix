package service;

import dao.ContactDao;
import po.Conctact;

public class ContactService {
    private ContactDao contactDao=new ContactDao();
    public String AddContact(Conctact conctact){
        if(contactDao.addAdvice(conctact)=="true")
            return "true";
        else
            return "flase";
    }
}
