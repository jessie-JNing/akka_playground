package org.akka.essentials.wc.mapreduce.example.thread;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;

/**
 * Created by Jessie on 2017-09-20.
 */
public class ThreadMain {

    public static void main(String[] args) throws Exception {
        final ActorSystem system = ActorSystem.create("demo5", ConfigFactory.load("demo")
                .getConfig("demo5"));

        // 创建一个到greeter Actor的管道
        final ActorRef controlActor = system.actorOf(Props.create(ControlActor.class), "control");

        controlActor.tell(new StartCommand(1000), null);

//        system.shutdown();
    }
}
