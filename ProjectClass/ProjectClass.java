class ProjectClass{

    private String name;
    private String description;

//############ Project() ###############
    public ProjectClass(){
        this("noNameDefaultValue", "noDescriptionDefaultValue");
    }
    //setter of the Project()
    public void setName(String nameParam){
        this.name = nameParam;
    }
    public void setDescription(String descriptionParam){
        this.description = descriptionParam;
    }

    //getter of the Project()
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

// //############ Project(String name) ###############
//     public ProjectClass(String name){
//         this.name = name;
//     }


//############ Project(String name, String description) ###############
    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
    }
    //getter of the Project(String name, String description) 
    public String elevatorPitch(ProjectClass objectParam){
        return objectParam.name + " : "+objectParam.description;
    }

}