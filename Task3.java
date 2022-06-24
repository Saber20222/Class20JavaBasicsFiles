package com.syntax.class20;

public class Task3 {
    /*
    Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes
    */
    public static void main(String[] args) {
      ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
      chemistryTeacher.name="Saber";
      chemistryTeacher.favouriteChemistrySubject="organic";
      chemistryTeacher.teachesChemistry();
    }
}
class Teacher{
    String name;
    String typeOfTeacher;
    void teach(){
        System.out.println(name+" teaches "+typeOfTeacher);
    }
}
class MathTeacher extends Teacher{
    String favouriteMathSubject;
    public void teachesMath(){
        System.out.println(name+"Teaches Math and his favourite math subject is "+favouriteMathSubject);
    }
}
class ChemistryTeacher extends Teacher{
    String favouriteChemistrySubject;
    public void teachesChemistry(){
        System.out.println(name+" Teaches Chemistry and his favourite math subject is "+favouriteChemistrySubject);
    }
}
class PianoTeacher extends Teacher{
    String favouriteModelOfPiano;
    public void teachesPiano(){
        System.out.println(name+" Teaches Piano and his favourite Piano Model is "+favouriteModelOfPiano);
    }
}