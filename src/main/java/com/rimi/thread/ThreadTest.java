package com.rimi.thread;

/**
 * 线程练习：需求  设计4个线程 其中两个线程每次对 j 加1  另外两个线程对 j 减 1
 */
public class ThreadTest {
    private int j;

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Inc inc = threadTest.new Inc();
        Dec dec = threadTest.new Dec();

        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(inc);
            thread.start();
            thread  = new Thread(dec);
            thread.start();
        }
    }

    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc"+j);
    }
    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec"+j);
    }

     class Inc implements Runnable {
         @Override
         public void run() {
             for (int i = 0; i < 100 ; i++) {
                 inc();
             }
         }
     }

     class Dec implements Runnable{
         @Override
         public void run() {
             for (int i = 0; i < 100 ; i++) {
                 dec();
             }
         }
     }
}
