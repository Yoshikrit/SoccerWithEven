/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerwitheven;

/**
 *
 * @author acer
 */
import java.util.EventObject;

/**
 *
 * @author acer
 */
/**
 *
 * @author acer
 */
public class ScoreEvent extends EventObject{
    private String someData;
    public ScoreEvent(Object o , String val) {
        super(o);
        someData = val;
    }
    public String getSomeData(){
        return someData;
    }
}
