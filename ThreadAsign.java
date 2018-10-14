import java.util.*;

import java.io.*;

class ThreadAsign

{

    public static long count=1;

    

    public static synchronized void IncCount(int n,int m)

    {

        for(int i=n;i<m;i++){

            count=count*2;

            //System.out.println(count);

        }

        try{

            Thread.sleep(1000);

        }catch(InterruptedException e){

        

        }

    }

    public static void main(String args[])

    {

        Thread t1=new Thread(new Runnable(){

            public void run(){

                IncCount(0,20);

            }

        });

        

        Thread t2=new Thread(new Runnable(){

            public void run(){

                IncCount(20,40);

            }

        });

        

        t1.start();

        t2.start();

        

        try{

            t1.join();

            t2.join();

        }catch(InterruptedException e){

            System.out.println("INTERRUPTED!");

        }

        

        System.out.println("Total No.of Virus Count : "+count);

    }

}