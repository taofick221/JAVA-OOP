public class Parameter_methods {
    private String name;
    private String  id;
    private double cgpa;
    public void displayinfo(){
        System.out.println("Name  :"  +name);
        System.out.println("Id :"+id);
        System.out.println("CGPA  :"+cgpa);
    }
    public void setinfo(String n,String id,double cgpa){
        name=n;
        this.id=id;
        this.cgpa=cgpa;

    }

    public static void main(String[] args) {
        Parameter_methods stu1=new Parameter_methods();
        stu1.setinfo("Md taofick","847",3.5);
        stu1.displayinfo();

        Parameter_methods stu2=new Parameter_methods();
        stu2.setinfo("Md Red","221-35-1000",4.5);
        stu2.displayinfo();




    }
}
