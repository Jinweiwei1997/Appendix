package po;


public class Conctact {
    private  int id;
    private String name;
    private String email;
    private String advice;
    public String getName(){
        return  name;
    }
    public String getEmail(){
        return  email;
    }
    public String getAdvice(){
        return  advice;
    }
    public int getId(){return id;}
    public void  setName(String name){
        this.name=name;
    }
    public void setId(int id){this.id=id;}
    public  void  setEmail(String email){
        this.email=email;
    }
    public void setAdvice(String advice){
        this.advice=advice;
    }


}
