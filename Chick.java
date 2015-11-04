class Chick implements Animal 
{     
     //your code here
     private String myType;     
     private String mySound;      
     private String mySound2;
     public Chick(String type, String sound, String cluck)     {         
         myType = type;         
         mySound = sound;     
         mySound2 = cluck;
     }     
     public void Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public Chick() {
     }
     public String getSound(){
       if(Math.random() > 0.5){
          return mySound;
        } 
        else return mySound2;}    
     public String getType(){return myType;}
}
