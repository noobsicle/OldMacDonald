
class NamedCow extends Cow
{     
     //your code here

     private String myName;
     public NamedCow(String type, String name, String sound)     {         
         myType = type;         
         myName = name;   
         mySound = sound;  
     }     
     public NamedCow()     {         
        
         
         
     }      
     public String sayName() { return myName;}
}
