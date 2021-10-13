package action;

import com.opensymphony.xwork2.ActionSupport;
import po.Conctact;
import service.ContactService;

public class ContactAction extends ActionSupport {
    Conctact contact;
    ContactService contactService=new ContactService();

    public Conctact getContact() {
        return contact;
    }
public void setContact(Conctact contact){
        this.contact=contact;
}
    public String addContact(){
        System.out.println("===========:Action运行了");
        System.out.println(contact.getName());
        if(contactService.AddContact(contact)=="true")
            return "success";
        else
            return "fail";
    }
}
