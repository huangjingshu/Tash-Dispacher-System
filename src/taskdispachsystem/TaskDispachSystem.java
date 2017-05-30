/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskdispachsystem;

/**
 *
 * @author jingshuhuang
 */
public class TaskDispachSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Event e = new Event("event1");
        Handler h = new Handler();
        e.reg_cb(h);
        e.reg_cb(h);
        e.event_fire();
        e.reg_cb(h);
    }

}
