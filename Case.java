public class Case{
   int caseNum = 0;
   double caseMoney = 0.0;
   boolean opened = false;
   boolean pCase = false;
   Case(){
   }
   Case(int num, double money){
      caseNum = num;
      caseMoney = money;
   }
   public int getCaseNum(){
      return caseNum;
   }
   public double getCaseMoney(){
      return caseMoney;
   }
   public boolean getState(){
      return opened;
   }
   public boolean isPCase(){
      return pCase;
   }
   public void openCase(){
      opened = true;
   }
   public void pickedAsPlayer(){
      pCase = true;
   }
}