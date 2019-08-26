public class Case{
   int caseNum = 0;
   double caseMoney = 0.0;
   boolean opened = false;
   boolean pCase = false;
   // initialize variables
   Case(){
   }  // default constructor
   Case(int num, double money){
      caseNum = num;
      caseMoney = money;
   }  // initialize Case with given parameters
   public int getCaseNum(){
      return caseNum;
   }  // return the Case's caseNum value
   public double getCaseMoney(){
      return caseMoney;
   }  // return the Case's caseMoney value
   public boolean getState(){
      return opened;
   }  // return the state of the opened boolean
   public boolean isPCase(){
      return pCase;
   }  // return the state of the pCase boolean
   public void openCase(){
      opened = true;
   }  // function to set the state of the case to "opened"
   public void pickedAsPlayer(){
      pCase = true;
   }  // function to set the case as being originally chosen by the player
}
