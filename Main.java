package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(7);
        MiceCheese m = new MiceCheese();
        m.populate(4);
        m.printMatrix();
        System.out.println("All the relevant info for finding the Cheese:");
        int counter =0;
        
        List<MiceCheeseThreads> multipleCheese8 = new ArrayList<>();
        for (int i = 0; i < 8; i++)
        {
            Date dateStart = new Date();
           Date dateTotal = new Date();
           multipleCheese8.add(new MiceCheeseThreads(m));
            multipleCheese8.get(i).startTime=dateStart.getTime();
            multipleCheese8.get(i).numRow=1;
            multipleCheese8.get(i).totalTime=dateTotal.getTime()-multipleCheese8.get(i).startTime;
            multipleCheese8.get(i).setCounter(counter);

           multipleCheese8.get(i).setRow(i);
           multipleCheese8.get(i).start();
           counter=counter+multipleCheese8.get(i).counter;
        }
        
   //     List<MiceCheeseThreads> multipleCheese4 = new ArrayList<>();
  //     for (int i = 0; i < 4; i++)
  //      {
   //         Date dateStart = new Date();
  //          Date dateTotal = new Date();
   //         multipleCheese4.add(new MiceCheeseThreads(m));
   //         multipleCheese4.get(i).numRow=4;
   //         multipleCheese4.get(i).startTime=dateStart.getTime();
   //         multipleCheese4.get(i).totalTime=dateTotal.getTime()-multipleCheese4.get(i).startTime;
   //        multipleCheese4.get(i).setRow(i);
    //       multipleCheese4.get(i).start();
       // counter=counter+multipleCheese4.get(i).counter;
   //     }

   //     List<MiceCheeseThreads> multipleCheese1 = new ArrayList<>();
    //    for (int i = 0; i < 1; i++)
    //    {
    //        Date dateStart = new Date();
    //        Date dateTotal = new Date();
     //       multipleCheese1.add(new MiceCheeseThreads(m));
    //        multipleCheese1.get(i).numRow=8;
     //       multipleCheese1.get(i).startTime=dateStart.getTime();
     //       multipleCheese1.get(i).totalTime=dateTotal.getTime()-multipleCheese1.get(i).startTime;
     //       multipleCheese1.get(i).setRow(i);
     //       multipleCheese1.get(i).start();
      //      counter=counter+multipleCheese1.get(i).counter;
      //  }

    }
}