package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class Collections {
    public static void main(String[] args){
        List<Integer>aList=new ArrayList<Integer>();
        List<Integer>lList=new LinkedList<Integer>();
        long startTimeA,endTimeA,startTimeL,endTimeL,elapsedTimeA,elapsedTimeL;
        for(int i=0;i<1000000;i++){
            aList.add(i);
            lList.add(i);
        }
        startTimeL = System.nanoTime();
        //aList.get(9999);
        //aList.remove(0);
        //aList.remove(500000);
        aList.remove(999999);


        endTimeL= System.nanoTime();
        elapsedTimeL = endTimeL-startTimeL;
        System.out.println("ArrayList : "+elapsedTimeL+" nanoTime");


        startTimeA= System.nanoTime();

        //lList.get(999999);
        //lList.remove(0);
        //lList.remove(500000);
        lList.remove(999999);


        endTimeA= System.nanoTime();
        elapsedTimeA = endTimeA-startTimeA;

        System.out.println("LinkList : "+elapsedTimeA+" nanoTime");

    }
}
