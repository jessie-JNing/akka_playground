package org.akka.essentials.wc.mapreduce.example.thread;

/**
 * Created by Jessie on 2017-09-21.
 */
public class WriteMessage {

    private int index = 0;

    public WriteMessage(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
