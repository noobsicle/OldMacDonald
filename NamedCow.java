
class NamedCow extends Cow
{     
     //your code here
     private String mySound2;
     private String myName;
     public NamedCow(String type, String name, String sound2)     {         
         myType = type;         
         myName = name;   
         mySound2 = sound2;  
     }     
     public NamedCow()     {         
         myType = "unknown";         
         myName = "unknown";  
         
     }      
     public String getSound(){return mySound2; } 
     public String getType(){return myType;}
}
