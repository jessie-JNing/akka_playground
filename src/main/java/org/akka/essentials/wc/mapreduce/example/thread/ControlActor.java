package org.akka.essentials.wc.mapreduce.example.thread;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jessie on 2017-09-20.
 */
public class ControlActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof StartCommand) {

            List<ActorRef> actors = createActors(((StartCommand) message).getActorCount());

            /*这里使用了JDK1.8中的StreamAPI*/
//            actors.stream().parallel().forEach(actorRef -> actorRef.tell("Insert", null));
            int k =0;
            for (ActorRef actorRef:actors) {
                k++;
                actorRef.tell(new WriteMessage(k), null);
            }

        }
    }

    private List<ActorRef> createActors(int actorCount) {
        Props props = Props.create(WriterActor.class).withDispatcher("writer-dispatcher");

        List<ActorRef> actors = new ArrayList<ActorRef>(actorCount);
        for (int i = 0; i < actorCount; i++) {
            actors.add(getContext().actorOf(props,"writer_"+ i));
        }
        return actors;
    }
}
