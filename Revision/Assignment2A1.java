import java.util.*;
class Mythread extends Thread{
  String msg;
  Mythread(String msg){
    this.msg=msg;
  }
  public void run(){
      int i=0;
      while(true){
        System.out.println(msg+" "+i);
        i++;
      }
  }
}
class Assignment2A1{
  public static void main(String args[])
  {
    Mythread t1=new Mythread("Thread1");
    Mythread t2=new Mythread("Thread2");
    t1.start();
    t2.start();
  }
}
