import java.util.Scanner;
import java.util.ArrayList;

public class DealOrNoDeal{
   
   static Scanner dh = new Scanner(System.in);

   public static void main(String[]args){
      Case cases[];
      Case pCase;
      String reset = "";
      int offer = 0;
      int pChoice = 0;
      int casesToOpen = 0;
      int round = 1;
      boolean end = false;
      boolean quit = false;
      while(!quit){
         cases = newCases();
         reset = "";
         round = 1;
         end = false;
         double prizes[] = {0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000};
         casesToOpen = 6;
         System.out.println("Hi, I'm Howie Mandel, and welcome to Deal or No Deal!");
         pause(3);
         displayCases(cases);
         System.out.print("Choose your favorite case: ");
         pCase = cases[chooseCase() - 1];
         pCase.pickedAsPlayer();
         System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
         System.out.println("You have selected Case " + pCase.getCaseNum());
         pause(2);
         displayPrizes(cases, prizes);
         pause(1);
         System.out.println("Your selected case contains one of these cash values.");
         System.out.println("Now, let's open some cases.");
         pause(6);
         while(!end){
            if(round == 1){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " cases.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
               casesToOpen--;
            }
            if(round == 2){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " cases.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
               casesToOpen--;
            }
            if(round == 3){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " cases.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
               casesToOpen--;
            }
            if(round == 4){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                  System.out.println("In Round " + round + ", we'll open " + casesToOpen + " cases.");
                  pause(3);
                  for(int i = 0; i < casesToOpen; i++){
                     displayPrizes(cases, prizes);
                     pause(4);
                     displayCases(cases);
                     if(casesToOpen - i == 1){
                        System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                     }
                     else{
                        System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                     }
                     openCase(cases, pCase);
                  }
                  end = bankerOffer(cases, pCase);
                  if(end){
                     break;
                  }
                  round++;
                  casesToOpen--;
            }
            if(round == 5){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " cases.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
               casesToOpen--;
            }
            if(round == 6){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " case.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
            }
            if(round == 7){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " case.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
            }
            if(round == 8){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " case.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               round++;
            }
            if(round == 9){
               System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
               System.out.println("In Round " + round + ", we'll open " + casesToOpen + " case.");
               pause(3);
               for(int i = 0; i < casesToOpen; i++){
                  displayPrizes(cases, prizes);
                  pause(4);
                  displayCases(cases);
                  if(casesToOpen - i == 1){
                     System.out.print("Choose a case (" + (casesToOpen - i) + " case left): ");
                  }
                  else{
                     System.out.print("Choose a case (" + (casesToOpen - i) + " cases left): ");
                  }
                  openCase(cases, pCase);
               }
               end = bankerOffer(cases, pCase);
               if(end){
                  break;
               }
               pause(3);
               displayPrizes(cases, prizes);
               pause(4);
               displayCases(cases);
               finalChoice(cases, pCase);
               end = true;
            }
            //round++;
         }
         System.out.print("Play again? (Y/N) : ");
         reset = dh.nextLine();
         quit = true;
         if(reset.equalsIgnoreCase("y") || reset.equalsIgnoreCase("yes") || reset.equalsIgnoreCase("deal") || reset.equalsIgnoreCase("d")){
            quit = false;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
         }
         if(reset.equalsIgnoreCase("n") || reset.equalsIgnoreCase("no") || reset.equalsIgnoreCase("nodeal") || reset.equalsIgnoreCase("nd") || reset.equalsIgnoreCase("no deal")){
            System.out.println("Come back soon!");
            System.exit(0);
         }
      }
      System.exit(0);
   }
   public static Case[] newCases(){
      Case cases[] = new Case[26];
      int prizePos = 0;
      ArrayList<Double> prizes = new ArrayList<Double>();
      prizes.add(0.01); prizes.add(1.0); prizes.add(5.0);
      prizes.add(10.0); prizes.add(25.0);
      prizes.add(50.0); prizes.add(75.0); prizes.add(100.0);
      prizes.add(200.0); prizes.add(300.0); prizes.add(400.0);
      prizes.add(500.0); prizes.add(750.0); prizes.add(1000.0);   // add all them prizes
      prizes.add(5000.0); prizes.add(10000.0); prizes.add(25000.0);
      prizes.add(50000.0); prizes.add(75000.0); prizes.add(100000.0);
      prizes.add(200000.0); prizes.add(300000.0); prizes.add(400000.0);
      prizes.add(500000.0); prizes.add(750000.0); prizes.add(1000000.0);
      for(int i = 0; i < 26; i++){
         prizePos = (int)(Math.random() * prizes.size());
         cases[i] = new Case(i + 1, prizes.get(prizePos));
         prizes.remove(prizePos);
      }
      return cases;
   }
   
   public static void displayCases(Case[] cases){
      int caseNo = 0;
      System.out.println("-=-=-=-=-=-=-=- CASES -=-=-=-=-=-=-=-");
      for(int i = 0; i < 4; i++){
         if(i == 1 || i == 2){
            for(int j = 0; j < 7; j++){
               if(!cases[caseNo].getState() && !cases[caseNo].isPCase())
                  System.out.print("   " + cases[caseNo].getCaseNum());
               else
                  System.out.print("   X");
               caseNo++;
            }
         }
         else{
            System.out.print("   ");
            for(int j = 0; j < 6; j++){
               if(!cases[caseNo].getState() && !cases[caseNo].isPCase())
                  System.out.print("   " + cases[caseNo].getCaseNum());
               else
                  System.out.print("   X");
               caseNo++;
            }
         }
         System.out.println();
      }
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
   }
   
   public static void displayPrizes(Case[] cases, double[] prizes){
      prizes = checkPrizes(cases, prizes);
      System.out.println("-=-=-=-=-=-=-=- PRIZES -=-=-=-=-=-=-=-");
      for(int i = 0; i < 13; i++){
         if(prizes[i] != -1.0 && prizes[i] != 0.01){
            System.out.print("$" + prizes[i] + "0   -=-=-   ");
         }
         else if(prizes[i] != -1.0 && prizes[i] == 0.01){
            System.out.print("$" + prizes[i] + "   -=-=-   ");
         }
         else{
            System.out.print("X   -=-=-   ");
         }
         if(prizes[i+13] != -1.0){
            System.out.print("$" + prizes[i+13] + "0");
         }
         else{
            System.out.print("X");
         }
         System.out.println();
      }
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
   }
   
   public static double[] checkPrizes(Case[] cases, double[] prizes){ 
      for(int i = 0; i < prizes.length; i++){
         for(int j = 0; j < cases.length; j++){
            if(cases[j].getCaseMoney() == prizes[i] && cases[j].getState()){
               prizes[i] = -1.0;
            }
         }
      } 
      return prizes;
   }
   
   public static void pause(int seconds){
      try{
         Thread.sleep(seconds * 1000);
      }
      catch(InterruptedException e){
      
      }
   }
   
   public static int chooseCase(){
      boolean valid = false;
      int pChoice = dh.nextInt();
      
      while(!valid){
         if(pChoice <= 26 && pChoice > 0){
            valid = true;
         }
         else{
            System.out.println("That is not a valid case number. Please try again");
            System.out.print("Choose a case: ");
            pChoice = dh.nextInt();
         }
      }
      return pChoice;
   }
   
   public static void openCase(Case[] cases, Case pCase){
      int choice = chooseCase();
      int flavor = 0;
      boolean valid = false;
      while(!valid){
         if(pCase.getCaseNum() == choice){
            System.out.println("You can't open your own case yet! Choose another one.");
            System.out.print("Choose a case: ");
            choice = dh.nextInt();
         }
         else if(cases[choice-1].getState()){
            System.out.println("That case has already been opened! Choose another one.");
            System.out.print("Choose a case: ");
            choice = dh.nextInt();
         }
         else{
            valid = true;
         }
      }
      System.out.println("You have chosen to open Case " + choice + ".");
      pause(1);
      System.out.println("Let's open it!");
      pause(1);
      System.out.print("Case " + choice + " contains... ");
      pause(3);
      if(cases[choice-1].getCaseMoney() == 0.01){
         System.out.println("$" + cases[choice-1].getCaseMoney());
      }
      else{
         System.out.println("$" + cases[choice-1].getCaseMoney() + "0");
      }
      cases[choice-1].openCase();
      pause(3);
      if(cases[choice-1].getCaseMoney() == 0.01){
         System.out.println("Howie says: PogChamp.");
      }
      if(cases[choice-1].getCaseMoney() == 1000000){
         System.out.println("Howie says: That's a big F in chat.");
      }
      if(cases[choice-1].getCaseMoney() >= 1 && cases[choice-1].getCaseMoney() < 1000){
         flavor = (int)(Math.random() * 5);
         if(flavor == 0){
            System.out.println("Howie says: Get that chump change outta here!");
         }
         if(flavor == 1){
            System.out.println("Howie says: That's good!");
         }
         if(flavor == 2){
            System.out.println("Howie says: What a pleasant surprise.");
         }
         if(flavor == 3){
            System.out.println("Howie says: AWWW YEAAAAHHH.");
         }
         if(flavor == 4){
            System.out.println("Howie says: w00t!");
         }
      }
      if(cases[choice-1].getCaseMoney() >= 1000 && cases[choice-1].getCaseMoney() < 100000){
         flavor = (int)(Math.random() * 5);
         if(flavor == 0){
            System.out.println("Howie says: Could be worse! Could also be better, but whatcha gonna do.");
         }
         if(flavor == 1){
            System.out.println("Howie says: That's not bad!");
         }
         if(flavor == 2){
            System.out.println("Howie says: There goes that.");
         }
         if(flavor == 3){
            System.out.println("Howie says: nice");
         }
         if(flavor == 4){
            System.out.println("Howie says: In CASE you were wondering, that's not in your case.");
         }
      }
      if(cases[choice-1].getCaseMoney() >= 100000 && cases[choice-1].getCaseMoney() < 1000000){
         flavor = (int)(Math.random() * 5);
         if(flavor == 0){
            System.out.println("Howie says: Oh Noey!");
         }
         if(flavor == 1){
            System.out.println("Howie says: You hate to see it!");
         }
         if(flavor == 2){
            System.out.println("Howie says: OOpsIE wOOpsIEs!!! >///<");
         }
         if(flavor == 3){
            System.out.println("Howie says: aww frick!");
         }
         if(flavor == 4){
            System.out.println("Howie says: That's a real downer.");
         }
      }
      pause(5);
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");   
   }
   
   public static boolean bankerOffer(Case[] cases, Case pCase){
      String decision = "";
      int offer = 0;
      int caseNum = 0;
      int flavor = (int)(Math.random()*10);
      int offerChance = (int)(Math.random()*4);
      double total = 0.0;
      for(int i = 0; i < cases.length; i++){
         if(!cases[i].getState()){
            total = total + cases[i].getCaseMoney();
            caseNum++;
         }
      }
      offer = (int)(total/caseNum);
      if(offerChance == 2){   // good offer
         offer = offer + ((int)((Math.random()*0.25)*offer));
      }
      if(offerChance == 3){   // bad offer
         offer = offer - ((int)((Math.random()*0.25)*offer));
      }
      if(flavor < 6){
         System.out.println("*phone ringing*");
      }
      if(flavor == 7){
         System.out.println("*firetruck sirens*");
      }
      if(flavor == 8){
         System.out.println("*bells ding-donging*");
      }
      if(flavor == 9){
         System.out.println("*Seinfeld theme plays*");
      }
      pause(3);
      System.out.println("That would be the Banker. Let's see what they have to offer.");
      pause(5);
      System.out.println("The Banker is willing to offer you $" + offer + ".00 to go home right now.");
      pause(3);
      System.out.println("Deal or No Deal?");
      System.out.print("(D / ND) : ");
      decision = dh.nextLine();
      decision = dh.nextLine();
      if(decision.equalsIgnoreCase("d") || decision.equalsIgnoreCase("deal") || decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("yes")){
         System.out.println("You've accepted the Banker's deal, so you're going home with $" + offer + ".00!");
         pause(2);
         if(offer < 0){
            System.out.println("*audience is in utter shock of the scenario unfolding in front of them*");
         }
         if(offer < 100 && offer >= 0){
            System.out.println("*audience breathes with disappointment*");
         }
         if(offer < 5000 && offer >= 100){
            System.out.println("*audience claps out of pity*");
         }
         if(offer < 100000 && offer >= 5000){
            System.out.println("*audience politely applauds*");
         }
         if(offer < 500000 && offer >= 100000){
            System.out.println("*audience applauds*");
         }
         if(offer >= 500000){
            System.out.println("*audience applauds out of admiration. Every single one of them wants to be you.*");
         }
         pause(3);
         System.out.println("But before we go, let's see what was in your case!");
         pause(3);
         System.out.println("Let's open it!");
         pause(1);
         System.out.print("Case " + pCase.getCaseNum() + " contains... ");
         pause(3);
         if(pCase.getCaseMoney() == 0.01){
            System.out.println("$" + pCase.getCaseMoney());
         }
         else{
            System.out.println("$" + pCase.getCaseMoney() + "0");
         }
         pause(4);
         if(offer > pCase.getCaseMoney()){
            System.out.println("Good call!");
         }
         if(offer < pCase.getCaseMoney()){
            System.out.println("Welp");
         }
         pause(5);
         if(offer >= 0){
            System.out.println("Well you're still going leaving here with $" + offer + ".00! Thanks for playing!");
         }
         else{
            System.out.println("Well you're gonna be billed for the $" + (offer * -1) + ".00 you owe the banker I guess! Thanks for playing I guess!");
         }
         return true;
      }
      if(decision.equalsIgnoreCase("nd") || decision.equalsIgnoreCase("no deal") || decision.equalsIgnoreCase("nodeal") || decision.equalsIgnoreCase("n") || decision.equalsIgnoreCase("no")){
         System.out.println("You've rejected the Banker's deal of $" + offer + ".00! Let's go back to opening cases.");
      }
      return false;
   }
   
   public static void finalChoice(Case[] cases, Case pCase){
      String choice = "";
      Case finalCase = new Case();
      for(int i = 0; i < cases.length; i++){
         if(!cases[i].getState() && cases[i] != pCase){
            finalCase = cases[i];
         }
      }
      System.out.println("There are only 2 cases left in play. You can choose to keep your current case...");
      System.out.println("OR you can swap it for the last remaining case.");
      pause(2);
      System.out.print("Do you want to swap your case? (Y/N): ");
      choice = dh.nextLine();
      if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("deal") || choice.equalsIgnoreCase("d")){
         System.out.println("You've decided to swap your case with Case " + finalCase.getCaseNum() + ".");
         pause(1);
         System.out.println("Let's open it!");
         pause(1);
         System.out.print("Case " + finalCase.getCaseNum() + " contains... ");
         pause(3);
         if(finalCase.getCaseMoney() == 0.01){
            System.out.println("$" + finalCase.getCaseMoney());
         }
         else{
            System.out.println("$" + finalCase.getCaseMoney() + "0");
         }
         pause(4);
         System.out.println("Now, let's see what your original case contained.");
         pause(1);
         System.out.print("Case " + pCase.getCaseNum() + " contains... ");
         pause(3);
         if(pCase.getCaseMoney() == 0.01){
            System.out.println("$" + pCase.getCaseMoney());
         }
         else{
            System.out.println("$" + pCase.getCaseMoney() + "0");
         }
         pause(4);
         if(pCase.getCaseMoney() > finalCase.getCaseMoney()){
            System.out.println("You've been had");
         }
         else{
            System.out.println("That was a very wise decision!");
         }
         pause(1);
         if(finalCase.getCaseMoney() < 100 && finalCase.getCaseMoney() >= 0){
            System.out.println("*audience breathes with disappointment*");
         }
         if(finalCase.getCaseMoney() < 5000 && finalCase.getCaseMoney() >= 100){
            System.out.println("*audience claps out of pity*");
         }
         if(finalCase.getCaseMoney() < 100000 && finalCase.getCaseMoney() >= 5000){
            System.out.println("*audience politely applauds*");
         }
         if(finalCase.getCaseMoney() < 500000 && finalCase.getCaseMoney() >= 100000){
            System.out.println("*audience applauds*");
         }
         if(finalCase.getCaseMoney() >= 500000){
            System.out.println("*audience applauds out of admiration. Every single one of them wants to be you.*");
         }
         if(finalCase.getCaseMoney() == 0.01){
            System.out.println("Well, you're walking out of here with $" + finalCase.getCaseMoney() + "! Thanks for Playing!");
         }
         else{
            System.out.println("Well, you're walking out of here with $" + finalCase.getCaseMoney() + "0! Thanks for Playing!");
         }
         pause(1);
      }
      if(choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("nodeal") || choice.equalsIgnoreCase("nd") || choice.equalsIgnoreCase("no deal")){
         System.out.println("You've decided to keep your case.");
         pause(1);
         System.out.println("Let's open it!");
         pause(1);
         System.out.print("Case " + pCase.getCaseNum() + " contains... ");
         pause(3);
         if(pCase.getCaseMoney() == 0.01){
            System.out.println("$" + pCase.getCaseMoney());
         }
         else{
            System.out.println("$" + pCase.getCaseMoney() + "0");
         }
         pause(4);
         System.out.println("Now, let's see what the remaining case contained.");
         pause(1);
         System.out.print("Case " + finalCase.getCaseNum() + " contains... ");
         pause(3);
         if(finalCase.getCaseMoney() == 0.01){
            System.out.println("$" + finalCase.getCaseMoney());
         }
         else{
            System.out.println("$" + finalCase.getCaseMoney() + "0");
         }
         pause(4);
         if(pCase.getCaseMoney() < finalCase.getCaseMoney()){
            System.out.println("You've been had");
         }
         else{
            System.out.println("That was a very wise decision!");
         }
         pause(1);
         if(finalCase.getCaseMoney() < 100 && finalCase.getCaseMoney() >= 0){
            System.out.println("*audience breathes with disappointment*");
         }
         if(finalCase.getCaseMoney() < 5000 && finalCase.getCaseMoney() >= 100){
            System.out.println("*audience claps out of pity*");
         }
         if(finalCase.getCaseMoney() < 100000 && finalCase.getCaseMoney() >= 5000){
            System.out.println("*audience politely applauds*");
         }
         if(finalCase.getCaseMoney() < 500000 && finalCase.getCaseMoney() >= 100000){
            System.out.println("*audience applauds*");
         }
         if(finalCase.getCaseMoney() >= 500000){
            System.out.println("*audience applauds out of admiration. Every single one of them wants to be you.*");
         }
         if(pCase.getCaseMoney() == 0.01){
            System.out.println("Well, you're walking out of here with $" + pCase.getCaseMoney() + "! Thanks for Playing!");
         }
         else{
            System.out.println("Well, you're walking out of here with $" + pCase.getCaseMoney() + "0! Thanks for Playing!");
         }
         pause(1);
      }
   }
   
}