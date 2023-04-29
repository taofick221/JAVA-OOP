public class Constructor {
    private String name;
    private int id;
    private double cgpa;
    Constructor(){
        System.out.println("No value");
    }
    Constructor(String n, int id,double cgpa){
        System.out.println("Student info :");
        name=n;
        this.id = id;
        this.cgpa =cgpa;
    }
    void displayinfo(){
        System.out.println("Name:"+name);
        System.out.println("Id :"+id);
        System.out.println("CGPA  :"+cgpa);
    }
    public static void main(String[] args) {
    Constructor stu1= new Constructor();
    stu1.displayinfo();

        Constructor stu2= new Constructor("Md taofick",847,3.5);
        stu2.displayinfo();
    }
}

