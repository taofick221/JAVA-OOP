package Ani_Inheritance;
public class Inheriting_private_member_part3 {

    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
         class Teacher extends Inheriting_private_member_part3{
            private String qualification;
            public void setQualification(String name){

                this.qualification=name;
            }
            public String getQualification(){
                return qualification;
            }

        void displayInfo(){
            System.out.println(getName());
            System.out.println(getAge());
            System.out.println(getQualification());
        }

        public static void main(String[] args) {
            Teacher ob=new Teacher();
            ob.setName("Taofick");
            ob.setAge(22);
            ob.setQualification("Bsc in Software Engineering");

            ob.displayInfo();
        }
}


