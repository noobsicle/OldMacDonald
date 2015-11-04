
class NamedCow implements Animal 
{     
     //your code here
	 private String myType;     
     private String mySound;      
     public NamedCow(String type, String sound, String sound2)     {         
         myType = type;         
         mySound = sound;   
         mySound = sound2;  
     }     
     public NamedCow()     {         
         myType = "unknown";         
         mySound = "unknown";  
         
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;}
}
