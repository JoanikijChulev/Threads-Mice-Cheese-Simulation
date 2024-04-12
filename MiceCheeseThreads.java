package org.example;

public class MiceCheeseThreads extends Thread {

    long startTime;
    long totalTime;

    int boxOpenings;
    int row;

    int counter;

    int numRow;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    MiceCheese miceCheese;

    public int getNumRow() {
        return numRow;
    }

    public void setNumRow(int numRow) {
        this.numRow = numRow;
    }


    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public MiceCheeseThreads(MiceCheese miceCheese) {
        this.miceCheese = miceCheese;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void start() {

        if (numRow == 8) {
            for (int i = 0; i < 8; i++) {
                row = i;
                try {
                	findCheese();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if(numRow == 4) {
                if(row==3) {
                    row = 6;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    row = 7;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (row ==2 )
                {
                    row = 4;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    row = 5;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (row == 1)
                {
                    row = 2;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    row = 3;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (row ==0)
                {
                    row = 0;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    row = 1;
                    try {
                    	findCheese();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        }
        else {
            try {
            	findCheese();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public  void findCheese() throws InterruptedException {
        for (int j = 0; j < 8; j++) {

            if (miceCheese.getV()[row][j].value.equals("cheese")) {
                Thread.sleep(10);
                counter++;
                boxOpenings=counter;
                System.out.println(Thread.currentThread().getName() + "*FOUND CHEESE AT I = " + row + " AND J = " + j);
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("Start time (ms) =" + startTime);
                System.out.println("Total time (ms) = " + totalTime + " Box opening count =" + boxOpenings);
            } 
            else {
                Thread.sleep(10);
                counter++;
                boxOpenings=counter;
                System.out.print("Not found here! ");
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("Start time (ms) =" + startTime);
                System.out.println("Total time (ms) = " + totalTime + " Box opening count =" + boxOpenings);
            }
        }
    }
    public synchronized void findCheeseSync() throws InterruptedException {
        for (int j = 0; j < 8; j++) {

            if (miceCheese.getV()[row][j].value.equals("cheese")) {
                Thread.sleep(10);
                counter++;
                boxOpenings=counter;
                System.out.println(Thread.currentThread().getName() + "*FOUND CHEESE AT I = " + row + " AND J = " + j);
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("Start time (ms) =" + startTime);
                System.out.println("Total time (ms) = " + totalTime + " Box opening count =" + boxOpenings);
            } 
            else {
                Thread.sleep(10);
                counter++;
                System.out.println("Not found here!");
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("Start time (ms) =" + startTime);
                System.out.println("Total time (ms) = " + totalTime + " Box opening count =" + boxOpenings);
            }
        }
    }

}
