package dao;

import po.Conctact;

public class ContactDao {
    private Conctact conctact=new Conctact();
    public String addAdvice(Conctact conctact){
        if(conctact.getName()!="")
        return "true";
        else
            return "false";
    }
}
