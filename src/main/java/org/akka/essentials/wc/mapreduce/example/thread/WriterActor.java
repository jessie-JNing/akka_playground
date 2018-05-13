package org.akka.essentials.wc.mapreduce.example.thread;

import akka.actor.UntypedActor;

/**
 * Created by Jessie on 2017-09-20.
 */
public class WriterActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof WriteMessage) {
            System.out.println( ((WriteMessage) message).getIndex()+ "   " +Thread.currentThread().getId() + "  " + Thread.currentThread().getName());
        }



    }
}
