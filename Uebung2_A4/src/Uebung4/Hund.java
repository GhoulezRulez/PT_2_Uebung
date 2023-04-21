package Uebung4;

public class Hund {

    private String name;
    private int age;

    //ExceptionHandling
    public Hund ( String name, int alter)throws HundeAlterInvalide { //Konstrukter mit name und alter wird geschrieben
        this.name = name;                                           //dieser kann die Exception Uebung4.HundeAlterInvalide throwen
        if(alter>=0){
            this.age = alter;
        }else{
            throw new HundeAlterInvalide("What happend to your dog, man?");
        }
    }



    public Hund(int age) throws HundeAlterInvalide{

        if(age >= 0) {
            this.age = age;
        }
        else{
           throw new HundeAlterInvalide("Your nameless dog is not born yet.");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws HundeAlterInvalide {
        if(age>=0){
        this.age=age;
    }
        else{
            throw new HundeAlterInvalide("Dont do it, man. Your dog cant be resurrected.");
        }
    }

    public int alterInPersonenJahren(){
       int personenAlter = this.age*7;
       return personenAlter;
    }

    @Override
    public String toString() {
    return "Name='"+ name +'\''+", Alter= "+age+"(In Menschenjahren:"+alterInPersonenJahren()+")";
    }



}
