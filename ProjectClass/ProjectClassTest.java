class ProjectClassTest{
    public static void main(String[] args){

        //constructor of 2 instances of the class ProjectClass
        ProjectClass project_1 = new ProjectClass();
        ProjectClass project_2 = new ProjectClass();

        //calling the getter methods to show default values
        // System.out.println(project_1.getDescription());
        // System.out.println(project_1.getName());

        project_1.setName("Java full stack");
        project_1.setDescription("language oriented programming");

        System.out.println("The name of the project_1 is: "+project_1.getName()+". The description of the project_1 is: "+project_1.getDescription());
        System.out.println(project_2.elevatorPitch(project_1));
    }
}