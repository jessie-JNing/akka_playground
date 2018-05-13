package org.akka.essentials.wc.mapreduce.example.thread;

/**
 * Created by Jessie on 2017-09-20.
 */
public class StartCommand {

    private int actorCount =0;

    private int index = 0;

    public StartCommand() {
    }

    public StartCommand(int actorCount) {
        this.actorCount = actorCount;
    }

    public int getActorCount() {
        return actorCount;
    }

    public void setActorCount(int actorCount) {
        this.actorCount = actorCount;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
