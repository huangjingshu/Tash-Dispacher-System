/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskdispachsystem;

import java.util.*;

/**
 *
 * @author jingshuhuang
 */
public class Event {

    List<Handler> handlerList = new ArrayList<>();
    String eventName;
    boolean flag;

    void reg_cb(Handler h) {
        h.eventString = eventName;
        handlerList.add(h);
        if (flag) {
            h.execute();
        }
    }

    void event_fire() {
        flag = true;
        for (Handler handler : handlerList) {
            handler.execute();
        }
    }

    public Event(String str) {
        eventName = str;
        flag = false;
    }
}
